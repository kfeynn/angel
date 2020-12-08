package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.RVBS_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RVBS_FILEMapperPlus
{

    List<RVBS_FILE> selectByRvbs01(@Param("rvbs01") String rvbs01);
}