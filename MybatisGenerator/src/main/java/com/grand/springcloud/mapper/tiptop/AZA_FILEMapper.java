package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.AZA_FILE;
import java.util.List;

public interface AZA_FILEMapper {
    int deleteByPrimaryKey(String aza01);

    int insert(AZA_FILE record);

    AZA_FILE selectByPrimaryKey(String aza01);

    List<AZA_FILE> selectAll();

    int updateByPrimaryKey(AZA_FILE record);
}