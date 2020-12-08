package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMGS_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMGS_FILEMapper {
    int deleteByPrimaryKey(@Param("imgs01") String imgs01, @Param("imgs02") String imgs02, @Param("imgs03") String imgs03, @Param("imgs04") String imgs04, @Param("imgs05") String imgs05, @Param("imgs06") String imgs06, @Param("imgs11") String imgs11);

    int insert(IMGS_FILE record);

    IMGS_FILE selectByPrimaryKey(@Param("imgs01") String imgs01, @Param("imgs02") String imgs02, @Param("imgs03") String imgs03, @Param("imgs04") String imgs04, @Param("imgs05") String imgs05, @Param("imgs06") String imgs06, @Param("imgs11") String imgs11);

    List<IMGS_FILE> selectAll();

    int updateByPrimaryKey(IMGS_FILE record);
}