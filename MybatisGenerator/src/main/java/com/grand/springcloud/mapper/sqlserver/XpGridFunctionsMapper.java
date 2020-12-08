package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import java.util.List;

public interface XpGridFunctionsMapper {
    int deleteByPrimaryKey(String funccode);

    int insert(XpGridFunctions record);

    XpGridFunctions selectByPrimaryKey(String funccode);

    List<XpGridFunctions> selectAll();

    int updateByPrimaryKey(XpGridFunctions record);
}