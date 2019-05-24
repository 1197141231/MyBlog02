package com.bugong.mapper;

import com.bugong.domain.BUser;
import com.bugong.domain.BUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BUserMapper {
    long countByExample(BUserExample example);

    int deleteByExample(BUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BUser record);

    int insertSelective(BUser record);

    List<BUser> selectByExample(BUserExample example);

    BUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByExample(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByPrimaryKeySelective(BUser record);

    int updateByPrimaryKey(BUser record);



    //登陆验证
    List<BUser> login(String userName);
}