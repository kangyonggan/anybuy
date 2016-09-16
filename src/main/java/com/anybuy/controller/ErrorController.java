package com.anybuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kangyonggan
 * @since 16/9/15
 */

@Controller
@RequestMapping
public class ErrorController {

    @RequestMapping(value = "404", method = RequestMethod.GET)
    public String error404() {
        return "error/404";
    }

    @RequestMapping(value = "405", method = RequestMethod.GET)
    public String error405() {
        return "error/405";
    }

    @RequestMapping(value = "400", method = RequestMethod.GET)
    public String error400() {
        return "error/400";
    }

}
