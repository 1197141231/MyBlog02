package com.bugong.mapper;

import com.bugong.domain.BArticle;
import com.bugong.domain.BArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BArticleMapper {
    long countByExample(BArticleExample example);

    int deleteByExample(BArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BArticle record);

    int insertSelective(BArticle record);

    List<BArticle> selectByExampleWithBLOBs(BArticleExample example);

    List<BArticle> selectByExample(BArticleExample example);

    BArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BArticle record, @Param("example") BArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") BArticle record, @Param("example") BArticleExample example);

    int updateByExample(@Param("record") BArticle record, @Param("example") BArticleExample example);

    int updateByPrimaryKeySelective(BArticle record);

    int updateByPrimaryKeyWithBLOBs(BArticle record);

    int updateByPrimaryKey(BArticle record);
}