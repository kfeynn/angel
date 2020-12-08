package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface XpGridFunctionsForPublicMapperPlus
{
    //自定义
    List<XpGridFunctionsForPublic> selectListByUserId();


}