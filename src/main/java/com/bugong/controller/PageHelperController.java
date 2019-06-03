package com.bugong.controller;


import com.bugong.domain.PageHelper;
import com.bugong.domain.BArticle;
import com.bugong.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@Controller
@RequestMapping("/Page")
public class PageHelperController {

    @Autowired
    ArticleService articleService ;


    @RequestMapping("/tableExampleClient")
    @ResponseBody
    public List<BArticle> getKeyWords(@RequestBody BArticle bArticle) {
        String a = bArticle.getContent();
        String b = bArticle.getTitle();
        bArticle.setUserId(1);

        PageHelper<BArticle> pageHelper = new PageHelper<BArticle>();
        List<BArticle> list = articleService.selectUserArt(bArticle);
        pageHelper.setRows(list);
        // 统计总记录数
        int counts = list.size();
        pageHelper.setTotal(counts);

         return list;
    }


    @RequestMapping("/tableExampleServer")
    @ResponseBody
    public PageHelper<BArticle> getUserListPage(@RequestBody BArticle bArticle) {
        String a = "ss";
        int b =  bArticle.getLimit();
        int c =  bArticle.getOffset();
        int d = bArticle.getPage();
        bArticle.setUserId(1);
        PageHelper<BArticle> pageHelper = new PageHelper<BArticle>();

        List<BArticle> list = articleService.selectUserArt(bArticle);
        // 查询当前页实体对象
        pageHelper.setRows(list);
        // 统计总记录数
        List<BArticle> list02 = articleService.selectUserArtCount(bArticle);
        pageHelper.setTotal(list02.size());


        return pageHelper;



    }

    @RequestMapping("/tableExampleServer02")
    @ResponseBody
    public PageHelper<BArticle> getUserListPage02(BArticle bArticle) {
        String a = "ss";
        int b =  bArticle.getLimit();
        int c =  bArticle.getOffset();
        int d = bArticle.getPage();
        bArticle.setUserId(1);
        PageHelper<BArticle> pageHelper = new PageHelper<BArticle>();

        List<BArticle> list = articleService.selectUserArt(bArticle);
        // 查询当前页实体对象
        pageHelper.setRows(list);
        // 统计总记录数
        List<BArticle> list02 = articleService.selectUserArtCount(bArticle);
        pageHelper.setTotal(list02.size());


        return pageHelper;



    }

}
