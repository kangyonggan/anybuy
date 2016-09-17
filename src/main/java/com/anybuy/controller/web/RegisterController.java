package com.anybuy.controller.web;

import com.anybuy.constant.AppConstant;
import com.anybuy.constant.SessionConstant;
import com.anybuy.model.User;
import com.anybuy.model.ValidationResponse;
import com.anybuy.service.UserService;
import com.anybuy.util.RegexUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 注册 相关控制
 * @author houbinbin
 * @since 16/9/16
 */
@Controller
@RequestMapping("register")
public class RegisterController {

    private static final String PATH_ROOT = "web/register/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

    @Resource
    private UserService userService;

    /**
     * 注册界面
     *
     * - 设置是否验证为: 未验证
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute(SessionConstant.SESSION_IS_VERIFY_KEY, SessionConstant.NOT_VERIFY);

        return PATH_INDEX;
    }

    /**
     * 注册验证
     * - 前台拖拽滑块进行验证
     * @param request
     * @return
     */
    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @ResponseBody
    public String verify(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute(SessionConstant.SESSION_IS_VERIFY_KEY, SessionConstant.IS_VERIFY);
        return AppConstant.SUCCESS;
    }

    /**
     * 注册验证手机号
     * @param mobile
     * @param request
     * @return
     */
    @RequestMapping(value = "/verify/mobile", method = RequestMethod.POST)
    @ResponseBody
    public ValidationResponse verifyMobile(String mobile, HttpServletRequest request) {
        ValidationResponse response = new ValidationResponse();
        response.setStatus(AppConstant.FAIL);
        if(!RegexUtil.isChinaMobile(mobile)) {
            response.setMessage("不是合法的大陆手机号码!");
            return response;
        }

        User user = userService.getUserByMobile(mobile);
        if(user != null) {
            response.setMessage("该手机号已被注册!");
            return response;
        }

        response.setStatus(AppConstant.SUCCESS);
        return response;
    }
}
