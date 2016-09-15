package com.anybuy.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页相关控制
 *
 * @author kangyonggan
 * @since 16/9/15
 */
@Controller
@RequestMapping
public class IndexController {

    private static final String PATH_ROOT = "web/index/";
    private static final String PATH_INDEX = PATH_ROOT + "index";

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return PATH_INDEX;
    }

}
