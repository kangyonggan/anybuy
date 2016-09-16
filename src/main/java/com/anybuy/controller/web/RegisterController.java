package com.anybuy.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 注册 相关控制
 * @author houbinbin
 * @since 16/9/16
 */
@Controller
@RequestMapping
public class RegisterController {
    private static final String PATH_ROOT = "web/register/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

    /**
     * 注册界面
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String index() {
        return PATH_INDEX;
    }
}
