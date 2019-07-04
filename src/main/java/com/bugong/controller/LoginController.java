package com.bugong.controller;

import com.bugong.domain.BArticle;
import com.bugong.domain.Page;
import com.bugong.domain.PageHelper;
import com.bugong.service.ArticleService;
import com.bugong.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService loginService ;
    @Autowired
    ArticleService articleService ;

    @RequestMapping("toLogin")
    public String toLogin(Model model) {
        BArticle bArticle = new BArticle();
        bArticle.setUserId(1);
        List<BArticle> list = articleService.selectUserArt(bArticle);
        model.addAttribute("artList", list);

        return "/test";
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


    @RequestMapping("/page")
    public String getUserListPage(Model model) {
        Page p = new Page();
        p.setLimit(10);
        p.setOffset(200);
        p.setPage(1);
        model.addAttribute("page", 100);

        return "/bootstrapPageTest02";
    }



}
