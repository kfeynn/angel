package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridRole;
import java.util.List;

public interface XpGridRoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(XpGridRole record);

    XpGridRole selectByPrimaryKey(Integer roleid);

    List<XpGridRole> selectAll();

    int updateByPrimaryKey(XpGridRole record);
}