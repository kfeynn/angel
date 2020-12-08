package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMG_FILE;
import java.util.List;

public interface IMG_FILEMapper {
    int insert(IMG_FILE record);

    List<IMG_FILE> selectAll();
}