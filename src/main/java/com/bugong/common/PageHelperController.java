package com.bugong.common;


import com.bugong.domain.BArticle;
import com.bugong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Page")
public class PageHelperController {

    @Autowired
    ArticleService articleService ;
    int userId = 1 ;

    @RequestMapping("/getUserListPage")
    @ResponseBody
    public PageHelper<BArticle> getUserListPage(BArticle bArticle, HttpServletRequest request) {

        PageHelper<BArticle> pageHelper = new PageHelper<BArticle>();
        List<BArticle> list = articleService.selectUserArt(userId);
        // 查询当前页实体对象
        pageHelper.setRows(list);
        // 统计总记录数
        int counts = list.size();
        pageHelper.setTotal(counts);

        return pageHelper;
    }




}
