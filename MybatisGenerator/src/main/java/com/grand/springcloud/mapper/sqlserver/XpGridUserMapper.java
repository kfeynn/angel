package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import java.util.List;

public interface XpGridUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(XpGridUser record);

    XpGridUser selectByPrimaryKey(Integer userid);

    List<XpGridUser> selectAll();

    int updateByPrimaryKey(XpGridUser record);
}