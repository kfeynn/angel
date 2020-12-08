package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.PMN_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PMN_FILEMapper {
    int deleteByPrimaryKey(@Param("pmn01") String pmn01, @Param("pmn02") Integer pmn02);

    int insert(PMN_FILE record);

    PMN_FILE selectByPrimaryKey(@Param("pmn01") String pmn01, @Param("pmn02") Integer pmn02);

    List<PMN_FILE> selectAll();

    int updateByPrimaryKey(PMN_FILE record);
}