package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.RVBS_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RVBS_FILEMapper {
    int deleteByPrimaryKey(@Param("rvbs00") String rvbs00, @Param("rvbs01") String rvbs01, @Param("rvbs02") Integer rvbs02, @Param("rvbs022") Integer rvbs022, @Param("rvbs09") Integer rvbs09, @Param("rvbs13") Integer rvbs13);

    int insert(RVBS_FILE record);

    RVBS_FILE selectByPrimaryKey(@Param("rvbs00") String rvbs00, @Param("rvbs01") String rvbs01, @Param("rvbs02") Integer rvbs02, @Param("rvbs022") Integer rvbs022, @Param("rvbs09") Integer rvbs09, @Param("rvbs13") Integer rvbs13);

    List<RVBS_FILE> selectAll();

    int updateByPrimaryKey(RVBS_FILE record);
}