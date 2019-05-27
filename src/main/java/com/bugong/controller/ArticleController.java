package com.bugong.controller;

import com.bugong.domain.BArticle;
import com.bugong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("Article")
public class ArticleController {
    @Autowired
    ArticleService articleService ;
    int userId = 1 ;

    @RequestMapping(value = "selectArtCount",method = RequestMethod.GET)
   // public  List<BArticle> selectArtCount(){
    public ModelAndView selectArtCount(HttpServletRequest request,
                                       HttpServletResponse response){

        ModelAndView modelView = new ModelAndView();
        modelView.addObject("name","张三");
        //类似于 request.setAttribute()
//        List<BArticle> list =  articleService.selectUserArt(userId);
//        modelView.addObject(list);
        modelView.setViewName("");


       // int re = articleService.getArtCount(userId);
      //  List<BArticle> list =  articleService.selectUserArt(userId);
        return modelView ;
    }


    //传入一般参数
    @RequestMapping(value="/Array",produces="text/html;charset=UTF-8")
    public String normal(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println("username:"+username+" password:"+password);
        request.setAttribute("info", "Normal server recv:"+username+" "+password);
        return "article.jsp";
    }


}
