package com.jpin.wateraffair.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    /**
     * 系统首页显示登录页面
     */
    @GetMapping("/")
    public String loginPage(){
        return "loginUI";
    }
}
