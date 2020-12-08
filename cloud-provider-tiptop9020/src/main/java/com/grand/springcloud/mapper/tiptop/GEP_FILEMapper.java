package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.GEP_FILE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GEP_FILEMapper {
    int deleteByPrimaryKey(String gep01);

    int insert(GEP_FILE record);

    GEP_FILE selectByPrimaryKey(String gep01);

    List<GEP_FILE> selectAll();

    int updateByPrimaryKey(GEP_FILE record);
}