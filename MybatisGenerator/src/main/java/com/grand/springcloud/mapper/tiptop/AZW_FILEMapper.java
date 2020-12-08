package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.AZW_FILE;
import java.util.List;

public interface AZW_FILEMapper {
    int insert(AZW_FILE record);

    List<AZW_FILE> selectAll();
}