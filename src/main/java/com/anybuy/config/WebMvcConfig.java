package com.anybuy.config;

import com.anybuy.constant.AppConstant;
import com.anybuy.interceptor.ControllerLogInterceptor;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author kangyonggan
 * @since 16/9/15
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
        registry.addResourceHandler("/upload/**").addResourceLocations("/WEB-INF/upload/");
    }

    @Bean
    public ServletContextInitializer initializer() {
        return new ServletContextInitializer() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                AppConstant.APP_ROOT = servletContext.getRealPath("") + "WEB-INF/";
            }
        };
    }

    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);

        /**
         * 匹配所有请求
         */
        registry.addInterceptor(new ControllerLogInterceptor()).addPathPatterns("/**");
    }
}
