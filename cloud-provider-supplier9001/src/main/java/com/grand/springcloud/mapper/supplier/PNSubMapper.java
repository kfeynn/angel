package com.grand.springcloud.mapper.supplier;

import com.grand.springcloud.entity.supplier.PNSub;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PNSubMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PNSub record);

    PNSub selectByPrimaryKey(Long id);

    List<PNSub> selectAll();

    int updateByPrimaryKey(PNSub record);
}