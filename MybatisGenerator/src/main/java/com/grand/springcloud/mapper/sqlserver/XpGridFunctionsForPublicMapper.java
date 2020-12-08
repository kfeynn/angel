package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import java.util.List;

public interface XpGridFunctionsForPublicMapper {
    int deleteByPrimaryKey(String funccode);

    int insert(XpGridFunctionsForPublic record);

    XpGridFunctionsForPublic selectByPrimaryKey(String funccode);

    List<XpGridFunctionsForPublic> selectAll();

    int updateByPrimaryKey(XpGridFunctionsForPublic record);
}