package com.ajman.test.springbootthymeleaf.component;


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Author keny
 * @Date 2020/1/29 0029 下午 3:26
 */
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
       String language=httpServletRequest.getParameter("l");
       Locale locale=null;
       if(!StringUtils.isEmpty(language)){
           String[] splits=language.split("_");
           locale=new Locale(splits[0],splits[1]);
       }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
