package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_BRF_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TC_BRF_FILEMapper {
    int deleteByPrimaryKey(@Param("tcBrf01") String tcBrf01, @Param("tcBrf02") String tcBrf02, @Param("tcBrf03") String tcBrf03);

    int insert(TC_BRF_FILE record);

    TC_BRF_FILE selectByPrimaryKey(@Param("tcBrf01") String tcBrf01, @Param("tcBrf02") String tcBrf02, @Param("tcBrf03") String tcBrf03);

    List<TC_BRF_FILE> selectAll();

    int updateByPrimaryKey(TC_BRF_FILE record);
}