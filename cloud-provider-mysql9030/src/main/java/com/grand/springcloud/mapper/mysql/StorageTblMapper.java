package com.grand.springcloud.mapper.mysql;

import com.grand.springcloud.entity.mysql.StorageTbl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StorageTblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StorageTbl record);

    StorageTbl selectByPrimaryKey(Integer id);

    List<StorageTbl> selectAll();

    int updateByPrimaryKey(StorageTbl record);
}