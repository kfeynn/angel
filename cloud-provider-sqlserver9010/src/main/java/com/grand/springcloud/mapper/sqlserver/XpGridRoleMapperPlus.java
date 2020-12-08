package com.grand.springcloud.mapper.sqlserver;


import com.grand.springcloud.entity.sqlserver.XpGridRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XpGridRoleMapperPlus
{
    XpGridRole selectByRoleName(String roleName);


}