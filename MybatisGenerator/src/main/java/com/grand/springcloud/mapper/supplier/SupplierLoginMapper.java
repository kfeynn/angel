package com.grand.springcloud.mapper.supplier;

import com.grand.springcloud.entity.supplier.SupplierLogin;
import java.util.List;

public interface SupplierLoginMapper {
    int deleteByPrimaryKey(String id);

    int insert(SupplierLogin record);

    SupplierLogin selectByPrimaryKey(String id);

    List<SupplierLogin> selectAll();

    int updateByPrimaryKey(SupplierLogin record);
}