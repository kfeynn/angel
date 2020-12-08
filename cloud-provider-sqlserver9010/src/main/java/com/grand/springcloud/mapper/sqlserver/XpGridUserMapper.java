package com.grand.springcloud.mapper.sqlserver;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface XpGridUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(XpGridUser record);

    XpGridUser selectByPrimaryKey(Integer userid);

    List<XpGridUser> selectAll();

    int updateByPrimaryKey(XpGridUser record);
}