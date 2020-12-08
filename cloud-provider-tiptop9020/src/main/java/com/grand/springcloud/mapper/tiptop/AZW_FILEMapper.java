package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.AZW_FILE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AZW_FILEMapper {
    int insert(AZW_FILE record);

    List<AZW_FILE> selectAll();
}