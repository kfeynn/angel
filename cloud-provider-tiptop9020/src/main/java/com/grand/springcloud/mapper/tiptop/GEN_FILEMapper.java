package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.GEN_FILE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GEN_FILEMapper {
    int deleteByPrimaryKey(String gen01);

    int insert(GEN_FILE record);

    GEN_FILE selectByPrimaryKey(String gen01);

    List<GEN_FILE> selectAll();

    int updateByPrimaryKey(GEN_FILE record);
}