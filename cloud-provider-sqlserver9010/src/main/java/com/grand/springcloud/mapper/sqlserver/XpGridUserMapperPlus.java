package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface XpGridUserMapperPlus
{
    //多个参数，用注入的方式传入
    int isExists(@Param("username") String username, @Param("password") String password);

    XpGridUser selectByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

}