package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.PMM_FILE;
import java.util.List;

public interface PMM_FILEMapper {
    int deleteByPrimaryKey(String pmm01);

    int insert(PMM_FILE record);

    PMM_FILE selectByPrimaryKey(String pmm01);

    List<PMM_FILE> selectAll();

    int updateByPrimaryKey(PMM_FILE record);
}