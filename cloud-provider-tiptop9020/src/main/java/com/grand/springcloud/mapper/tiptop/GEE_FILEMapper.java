package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.GEE_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GEE_FILEMapper {
    int deleteByPrimaryKey(@Param("gee01") String gee01, @Param("gee02") String gee02, @Param("gee03") String gee03);

    int insert(GEE_FILE record);

    GEE_FILE selectByPrimaryKey(@Param("gee01") String gee01, @Param("gee02") String gee02, @Param("gee03") String gee03);

    List<GEE_FILE> selectAll();

    int updateByPrimaryKey(GEE_FILE record);
}