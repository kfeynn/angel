package com.grand.springcloud.mapper.supplier;

import com.grand.springcloud.entity.supplier.PN;
import java.util.List;

public interface PNMapper {
    int deleteByPrimaryKey(String dnnum);

    int insert(PN record);

    PN selectByPrimaryKey(String dnnum);

    List<PN> selectAll();

    int updateByPrimaryKey(PN record);
}