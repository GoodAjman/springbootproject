package com.ajman.test.springbootthymeleaf.config;

import com.ajman.test.springbootthymeleaf.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @Author keny
 * @Date 2020/1/20 11:42
 * @Version 1.0
 */
@Configuration
public class myMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ajman").setViewName("success");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }
    @Bean(name="localeResolver")
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
