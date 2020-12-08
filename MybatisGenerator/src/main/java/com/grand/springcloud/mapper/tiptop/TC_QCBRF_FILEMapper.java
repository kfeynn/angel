package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_QCBRF_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TC_QCBRF_FILEMapper {
    int deleteByPrimaryKey(@Param("tcQcbrf01") String tcQcbrf01, @Param("tcQcbrf02") String tcQcbrf02, @Param("tcQcbrf03") String tcQcbrf03);

    int insert(TC_QCBRF_FILE record);

    TC_QCBRF_FILE selectByPrimaryKey(@Param("tcQcbrf01") String tcQcbrf01, @Param("tcQcbrf02") String tcQcbrf02, @Param("tcQcbrf03") String tcQcbrf03);

    List<TC_QCBRF_FILE> selectAll();

    int updateByPrimaryKey(TC_QCBRF_FILE record);
}