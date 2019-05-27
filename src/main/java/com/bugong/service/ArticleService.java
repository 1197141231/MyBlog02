package com.bugong.service;


import com.bugong.domain.BArticle;

import java.util.List;

public interface ArticleService {
     List<BArticle> selectUserArt(int userId);
}
