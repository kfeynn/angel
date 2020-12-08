package com.grand.springcloud.mapper.tiptop;


import com.grand.springcloud.entity.tiptop.TC_QCBRF_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TC_QCBRF_FILEMapperPlus
{
    List<TC_QCBRF_FILE> selectByQcBrf01(@Param("tcQcbrf01") String tcQcbrf01);

}