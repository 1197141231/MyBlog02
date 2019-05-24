package com.bugong.mapper;

import com.bugong.domain.BMessage;
import com.bugong.domain.BMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BMessageMapper {
    long countByExample(BMessageExample example);

    int deleteByExample(BMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BMessage record);

    int insertSelective(BMessage record);

    List<BMessage> selectByExampleWithBLOBs(BMessageExample example);

    List<BMessage> selectByExample(BMessageExample example);

    BMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BMessage record, @Param("example") BMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") BMessage record, @Param("example") BMessageExample example);

    int updateByExample(@Param("record") BMessage record, @Param("example") BMessageExample example);

    int updateByPrimaryKeySelective(BMessage record);

    int updateByPrimaryKeyWithBLOBs(BMessage record);

    int updateByPrimaryKey(BMessage record);
}