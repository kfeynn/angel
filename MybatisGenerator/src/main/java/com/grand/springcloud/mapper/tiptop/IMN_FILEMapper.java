package com.grand.springcloud.mapper.tiptop;

import com.grand.springcloud.entity.tiptop.IMN_FILE;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMN_FILEMapper {
    int deleteByPrimaryKey(@Param("imn01") String imn01, @Param("imn02") Integer imn02);

    int insert(IMN_FILE record);

    IMN_FILE selectByPrimaryKey(@Param("imn01") String imn01, @Param("imn02") Integer imn02);

    List<IMN_FILE> selectAll();

    int updateByPrimaryKey(IMN_FILE record);
}