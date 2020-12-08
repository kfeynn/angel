package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.ECBB_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ECBB_FILEMapper {
    int deleteByPrimaryKey(@Param("ecbb01") String ecbb01, @Param("ecbb02") String ecbb02, @Param("ecbb03") Integer ecbb03, @Param("ecbb09") Integer ecbb09, @Param("ecbb012") String ecbb012);

    int insert(ECBB_FILE record);

    ECBB_FILE selectByPrimaryKey(@Param("ecbb01") String ecbb01, @Param("ecbb02") String ecbb02, @Param("ecbb03") Integer ecbb03, @Param("ecbb09") Integer ecbb09, @Param("ecbb012") String ecbb012);

    List<ECBB_FILE> selectAll();

    int updateByPrimaryKey(ECBB_FILE record);
}