package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridUsersInRoles;
import java.util.List;

public interface XpGridUsersInRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XpGridUsersInRoles record);

    XpGridUsersInRoles selectByPrimaryKey(Integer id);

    List<XpGridUsersInRoles> selectAll();

    int updateByPrimaryKey(XpGridUsersInRoles record);
}