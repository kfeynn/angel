package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMG_FILE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IMG_FILEMapper {
    int insert(IMG_FILE record);

    List<IMG_FILE> selectAll();
}