package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * User: jennie
 * Date: 2016/4/12
 * Time: 11:23
 */
@Controller
public class MainController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Map<String,Object> viewObject) {
        System.out.println("henhao");
        return "index";
    }
}
