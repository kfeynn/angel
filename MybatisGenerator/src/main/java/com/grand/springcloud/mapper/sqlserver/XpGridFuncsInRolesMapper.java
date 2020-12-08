package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridFuncsInRoles;
import java.util.List;

public interface XpGridFuncsInRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XpGridFuncsInRoles record);

    XpGridFuncsInRoles selectByPrimaryKey(Integer id);

    List<XpGridFuncsInRoles> selectAll();

    int updateByPrimaryKey(XpGridFuncsInRoles record);
}