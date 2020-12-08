package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridUsersInRoles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface XpGridUsersInRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XpGridUsersInRoles record);

    XpGridUsersInRoles selectByPrimaryKey(Integer id);

    List<XpGridUsersInRoles> selectAll();

    int updateByPrimaryKey(XpGridUsersInRoles record);
}