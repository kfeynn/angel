package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMM_FILE;
import java.util.List;

public interface IMM_FILEMapper {
    int deleteByPrimaryKey(String imm01);

    int insert(IMM_FILE record);

    IMM_FILE selectByPrimaryKey(String imm01);

    List<IMM_FILE> selectAll();

    int updateByPrimaryKey(IMM_FILE record);
}