package com.ajman.test.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author keny
 * @Date 2020/1/19 15:34
 * @Version 1.0
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("name","ewewewewe");
        return "success";
    }
}
