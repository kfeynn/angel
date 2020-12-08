package com.grand.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface CommonMapper
{
    /** 通用查询返回LinkedHashMap */
    List<LinkedHashMap<String, Object>> commonSelect(String sql);

    /** 查询类似 select count 的语句 返回 int */
    int commonSelectInt(String sql);

    int commonSql(String sql);

//    /** sqlserver 通用分页工具 */
//    List<LinkedHashMap<String, Object>> Paging(Map<String, Object> map);

}