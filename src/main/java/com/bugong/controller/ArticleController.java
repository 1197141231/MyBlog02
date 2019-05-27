package com.bugong.controller;

import com.bugong.domain.BArticle;
import com.bugong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Article")
public class ArticleController {
    @Autowired
    ArticleService articleService ;
    int userId = 1 ;

    @RequestMapping("selectArtCount")
    public  List<BArticle> selectArtCount(HttpServletRequest request){
       // int re = articleService.getArtCount(userId);
        List<BArticle> list =  articleService.selectUserArt(userId);
        return list ;
    }

}
