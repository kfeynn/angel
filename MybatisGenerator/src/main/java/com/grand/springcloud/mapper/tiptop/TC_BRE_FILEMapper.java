package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.TC_BRE_FILE;
import java.util.List;

public interface TC_BRE_FILEMapper {
    int deleteByPrimaryKey(String tcBre01);

    int insert(TC_BRE_FILE record);

    TC_BRE_FILE selectByPrimaryKey(String tcBre01);

    List<TC_BRE_FILE> selectAll();

    int updateByPrimaryKey(TC_BRE_FILE record);
}