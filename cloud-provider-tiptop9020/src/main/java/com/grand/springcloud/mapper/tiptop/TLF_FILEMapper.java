package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TLF_FILE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TLF_FILEMapper {
    int insert(TLF_FILE record);

    List<TLF_FILE> selectAll();
}