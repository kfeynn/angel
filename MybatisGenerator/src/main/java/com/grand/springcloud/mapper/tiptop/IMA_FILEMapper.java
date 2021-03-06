package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMA_FILE;
import java.util.List;

public interface IMA_FILEMapper {
    int deleteByPrimaryKey(String ima01);

    int insert(IMA_FILE record);

    IMA_FILE selectByPrimaryKey(String ima01);

    List<IMA_FILE> selectAll();

    int updateByPrimaryKey(IMA_FILE record);
}