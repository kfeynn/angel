package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_BRF_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TC_BRF_FILEMapperPlus
{


    //TC_BRF_FILE selectByPrimaryKey(@Param("tcBrf01") String tcBrf01, @Param("tcBrf02") String tcBrf02, @Param("tcBrf03") String tcBrf03);

    List<TC_BRF_FILE> selectByBrf01(@Param("tcBrf01") String tcBrf01);


}