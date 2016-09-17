package com.anybuy.controller.web;

import com.anybuy.constant.AppConstant;
import com.anybuy.model.User;
import com.anybuy.model.ValidationResponse;
import lombok.extern.log4j.Log4j2;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * 登录相关控制
 *
 * @author kangyonggan
 * @since 16/9/15
 */
@Controller
@RequestMapping
@Log4j2
public class LoginController {

    private static final String PATH_ROOT = "web/login/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

    /**
     * session 持续有效时间:半小时
     * - setMaxInactiveInterval(int i)   i的单位是秒。
     * - 如果设置的值为零或负数，则表示会话将永远不会超时。常用于设置当前会话时间。
     */
    private static final Integer SESSION_TIME = 60 * 30;

    /**
     * 登录界面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return PATH_INDEX;
    }


    /**
     * 登录
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ValidationResponse login(User user, HttpServletRequest request) {
        ValidationResponse response = new ValidationResponse();
        response.setStatus(AppConstant.FAIL);

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(SESSION_TIME);


        UsernamePasswordToken token = new UsernamePasswordToken(user.getMobile(), user.getPassword());
        final Subject subject = SecurityUtils.getSubject();

        try {
            //会调用 ShiroDbRealm 的认证方法 doGetAuthenticationInfo(AuthenticationToken)
            subject.login(token);
        } catch (AuthenticationException e) {
            response.setMessage("用户名或者密码错误！");
            log.info(response.getMessage());
            return response;
        } catch (Exception e) {
            response.setMessage("未知错误，请联系管理员！");
            log.error("未知错误", e);
            return response;
        }

        SavedRequest savedRequest = WebUtils.getSavedRequest(request);
        String url = isNullRequestUrl(savedRequest) ? PATH_INDEX : savedRequest.getRequestUrl();
        response.setStatus(AppConstant.SUCCESS);
        response.setMessage(url);

        return response;
    }

    /**
     * 判断请求URL是否为NULL
     * @param savedRequest
     * @return
     */
    private Boolean isNullRequestUrl(SavedRequest savedRequest) {
        return savedRequest == null || savedRequest.getRequestUrl() == null;
    }

    /**
     * 注销
     *
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout() {
        final Subject subject = SecurityUtils.getSubject();
        log.info("logout {}", subject.getPrincipal());
        subject.logout();
        return "redirect:/";
    }

}
