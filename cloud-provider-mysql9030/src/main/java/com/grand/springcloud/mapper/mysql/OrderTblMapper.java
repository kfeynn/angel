package com.grand.springcloud.mapper.mysql;

import com.grand.springcloud.entity.mysql.OrderTbl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderTblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTbl record);

    OrderTbl selectByPrimaryKey(Integer id);

    List<OrderTbl> selectAll();

    int updateByPrimaryKey(OrderTbl record);
}