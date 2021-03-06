package com.grand.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface CommonMapper
{
    List<LinkedHashMap<String, Object>> commonSelect(String sql);

    /** 查询类似 select count 的语句 返回 int */
    int commonSelectInt(String sql);
    /** 执行原生sql语句 Delete、update、insert，返回Integer*/
    int commonSql(String sql);

    //通用分页工具
    List<LinkedHashMap<String, Object>> Paging(Map<String, Object> map);

}