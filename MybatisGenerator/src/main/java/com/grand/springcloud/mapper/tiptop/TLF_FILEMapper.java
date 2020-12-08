package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TLF_FILE;
import java.util.List;

public interface TLF_FILEMapper {
    int insert(TLF_FILE record);

    List<TLF_FILE> selectAll();
}