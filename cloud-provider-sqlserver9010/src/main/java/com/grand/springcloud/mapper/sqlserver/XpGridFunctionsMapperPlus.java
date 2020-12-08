package com.grand.springcloud.mapper.sqlserver;


import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//XpGridFunctionsMapperPlus 带Plus 是对XpGridFunctionsMapper进行改写。
// 增加方法，不对生成的文件进行改动。
@Mapper
public interface XpGridFunctionsMapperPlus
{
    //自定义
    List<XpGridFunctions> selectListByUserId(int sid);
}