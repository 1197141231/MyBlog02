package com.bugong.controller;


import com.bugong.domain.BArticle;
import com.bugong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.List;


@Controller
@RequestMapping("Article")
public class ArticleController {
    @Autowired
    ArticleService articleService ;



    @RequestMapping(value = "selectArtCount",method = RequestMethod.GET)
   // public  List<BArticle> selectArtCount(){
    public ModelAndView selectArtCount(HttpServletRequest request, HttpServletResponse response){

        return null ;
    }


    //传入一般参数
    @RequestMapping(value="/Array",produces="text/html;charset=UTF-8")
    public String normal(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println("username:"+username+" password:"+password);
        request.setAttribute("info", "Normal server recv:"+username+" "+password);
      //  return "/static/jsp/success.jsp";
        return "/article";
    }


    @RequestMapping("/news")
    @ResponseBody //返回数据定义为json,格式依赖于jackson包，没有报错
    public List<BArticle> getKeyWords() {
        BArticle bArticle = new BArticle();
        bArticle.setUserId(1);
        List<BArticle> list = articleService.selectUserArt(bArticle);
        return list;
    }

}
