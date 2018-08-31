package com.njust.mapper;

import com.njust.model.LlcSchemeView;
import com.njust.model.LlcSchemeViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSchemeViewMapper {
    long countByExample(LlcSchemeViewExample example);

    int deleteByExample(LlcSchemeViewExample example);

    int insert(LlcSchemeView record);

    int insertSelective(LlcSchemeView record);

    List<LlcSchemeView> selectByExample(LlcSchemeViewExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeView record, @Param("example") LlcSchemeViewExample example);

    int updateByExample(@Param("record") LlcSchemeView record, @Param("example") LlcSchemeViewExample example);
}