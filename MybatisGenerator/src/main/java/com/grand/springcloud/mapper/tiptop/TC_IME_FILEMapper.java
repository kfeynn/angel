package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_IME_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TC_IME_FILEMapper {
    int deleteByPrimaryKey(@Param("tcIme01") String tcIme01, @Param("tcIme02") String tcIme02, @Param("tcIme03") String tcIme03);

    int insert(TC_IME_FILE record);

    List<TC_IME_FILE> selectAll();
}