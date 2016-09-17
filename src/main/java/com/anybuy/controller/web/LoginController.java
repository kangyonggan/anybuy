package com.anybuy.controller.web;

import com.anybuy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录相关控制
 *
 * @author kangyonggan
 * @since 16/9/15
 */
@Controller
@RequestMapping
public class LoginController {

    private static final String PATH_ROOT = "web/login/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

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
    public String login(User user, Model model) {
        String mobile = user.getMobile();
        String password = user.getPassword();


        return PATH_INDEX;
    }

}
