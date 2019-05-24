package com.bugong.mapper;

import com.bugong.domain.BComment;
import com.bugong.domain.BCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BCommentMapper {
    long countByExample(BCommentExample example);

    int deleteByExample(BCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BComment record);

    int insertSelective(BComment record);

    List<BComment> selectByExampleWithBLOBs(BCommentExample example);

    List<BComment> selectByExample(BCommentExample example);

    BComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BComment record, @Param("example") BCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") BComment record, @Param("example") BCommentExample example);

    int updateByExample(@Param("record") BComment record, @Param("example") BCommentExample example);

    int updateByPrimaryKeySelective(BComment record);

    int updateByPrimaryKeyWithBLOBs(BComment record);

    int updateByPrimaryKey(BComment record);
}