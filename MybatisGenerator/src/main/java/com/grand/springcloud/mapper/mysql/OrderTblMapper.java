package com.grand.springcloud.mapper.mysql;

import com.grand.springcloud.entity.mysql.OrderTbl;
import java.util.List;

public interface OrderTblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTbl record);

    OrderTbl selectByPrimaryKey(Integer id);

    List<OrderTbl> selectAll();

    int updateByPrimaryKey(OrderTbl record);
}