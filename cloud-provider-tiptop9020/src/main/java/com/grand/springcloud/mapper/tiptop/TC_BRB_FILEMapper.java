package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_BRB_FILE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface TC_BRB_FILEMapper {
    int deleteByPrimaryKey(@Param("tcBrb01") String tcBrb01, @Param("tcBrb03") String tcBrb03, @Param("tcBrb08") Date tcBrb08);

    int insert(TC_BRB_FILE record);

    TC_BRB_FILE selectByPrimaryKey(@Param("tcBrb01") String tcBrb01, @Param("tcBrb03") String tcBrb03, @Param("tcBrb08") Date tcBrb08);

    List<TC_BRB_FILE> selectAll();

    int updateByPrimaryKey(TC_BRB_FILE record);
}