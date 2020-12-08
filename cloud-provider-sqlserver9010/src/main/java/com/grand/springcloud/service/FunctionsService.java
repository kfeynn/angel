package com.grand.springcloud.service;

import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;

import java.util.List;

/**
 * @author zyq
 * @date DATE 2020/10/14 16:18
 **/
public interface FunctionsService
{
    List<XpGridFunctionsForPublic> selectList();

    List<XpGridFunctions> selectListByUserId(String uid);
}
