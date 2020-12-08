package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface XpGridFunctionsMapper {
    int deleteByPrimaryKey(String funccode);

    int insert(XpGridFunctions record);

    XpGridFunctions selectByPrimaryKey(String funccode);

    List<XpGridFunctions> selectAll();

    int updateByPrimaryKey(XpGridFunctions record);
}