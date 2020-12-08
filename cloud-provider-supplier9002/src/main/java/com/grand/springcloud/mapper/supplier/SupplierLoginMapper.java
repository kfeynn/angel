package com.grand.springcloud.mapper.supplier;

import com.grand.springcloud.entity.supplier.SupplierLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierLoginMapper {
    int deleteByPrimaryKey(String id);

    int insert(SupplierLogin record);

    SupplierLogin selectByPrimaryKey(String id);

    List<SupplierLogin> selectAll();

    int updateByPrimaryKey(SupplierLogin record);
}