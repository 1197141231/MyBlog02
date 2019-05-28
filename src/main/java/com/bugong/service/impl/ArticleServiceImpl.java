package com.bugong.service.impl;



import com.bugong.domain.BArticle;
import com.bugong.mapper.BArticleMapper;
import com.bugong.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    BArticleMapper bArticleMapper ;

    @Override
    public List<BArticle> selectUserArt(int userId) {
       // List<BArticle> list =  bArticleMapper.selectUserArt(userId);
        List<BArticle> list =  bArticleMapper.selectUserArt(userId);

        return list;
    }

}
