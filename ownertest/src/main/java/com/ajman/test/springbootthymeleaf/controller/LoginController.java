package com.ajman.test.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author keny
 * @Date 2020/1/29 0029 下午 7:23
 */
@Controller
public class LoginController {

    @RequestMapping(value ="/user/login",method = RequestMethod.POST,produces = "text/html;charset=UTF-8" )
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登录成功,防止重复提交
            return "dashboard";
        }else{
            map.put("msg", "用户名密码错误");
            return "login";
        }

    }
}