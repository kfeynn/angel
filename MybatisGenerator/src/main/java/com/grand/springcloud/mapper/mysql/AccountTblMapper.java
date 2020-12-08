package com.grand.springcloud.mapper.mysql;

import com.grand.springcloud.entity.mysql.AccountTbl;
import java.util.List;

public interface AccountTblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountTbl record);

    AccountTbl selectByPrimaryKey(Integer id);

    List<AccountTbl> selectAll();

    int updateByPrimaryKey(AccountTbl record);
}