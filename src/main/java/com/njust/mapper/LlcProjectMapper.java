package com.njust.mapper;

import com.njust.model.LlcProject;
import com.njust.model.LlcProjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LlcProjectMapper {
    long countByExample(LlcProjectExample example);

    int maxId();

    int deleteByExample(LlcProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(LlcProject record);

    int insertSelective(LlcProject record);

    List<LlcProject> selectByExample(LlcProjectExample example);

    LlcProject selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") LlcProject record, @Param("example") LlcProjectExample example);

    int updateByExample(@Param("record") LlcProject record, @Param("example") LlcProjectExample example);

    int updateByPrimaryKeySelective(LlcProject record);

    int updateByPrimaryKey(LlcProject record);
}