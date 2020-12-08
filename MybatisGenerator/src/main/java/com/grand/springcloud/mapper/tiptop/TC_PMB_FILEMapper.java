package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_PMB_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TC_PMB_FILEMapper {
    int deleteByPrimaryKey(@Param("tcPmb01") String tcPmb01, @Param("tcPmb02") Integer tcPmb02);

    int insert(TC_PMB_FILE record);

    TC_PMB_FILE selectByPrimaryKey(@Param("tcPmb01") String tcPmb01, @Param("tcPmb02") Integer tcPmb02);

    List<TC_PMB_FILE> selectAll();

    int updateByPrimaryKey(TC_PMB_FILE record);
}