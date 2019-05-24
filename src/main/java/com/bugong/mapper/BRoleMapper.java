package com.bugong.mapper;

import com.bugong.domain.BRole;
import com.bugong.domain.BRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BRoleMapper {
    long countByExample(BRoleExample example);

    int deleteByExample(BRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BRole record);

    int insertSelective(BRole record);

    List<BRole> selectByExample(BRoleExample example);

    BRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BRole record, @Param("example") BRoleExample example);

    int updateByExample(@Param("record") BRole record, @Param("example") BRoleExample example);

    int updateByPrimaryKeySelective(BRole record);

    int updateByPrimaryKey(BRole record);
}