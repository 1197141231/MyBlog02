package com.bugong.controller;

import com.bugong.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService loginService ;


    @RequestMapping("toLogin")
    public String toLogin() {
        return "test.jsp";
    }


    @RequestMapping("loginSuccess")
    public String login(@RequestParam String loginname, @RequestParam String password,Model model) {
//        String loginname = user.getUserName();
//        String password = user.getUserPwd();
        Map<String, Object> map = loginService.login(loginname, password);
        if (map.get("status").equals("200")) {
            return "success.jsp";
        } else {
            model.addAttribute("error", map.get("msg"));
            return "login.jsp";
        }
    }


}
