package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface XpGridFunctionsForPublicMapper {
    int deleteByPrimaryKey(String funccode);

    int insert(XpGridFunctionsForPublic record);

    XpGridFunctionsForPublic selectByPrimaryKey(String funccode);

    List<XpGridFunctionsForPublic> selectAll();

    int updateByPrimaryKey(XpGridFunctionsForPublic record);
}