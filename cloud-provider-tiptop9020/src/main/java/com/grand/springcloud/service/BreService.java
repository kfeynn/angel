package com.grand.springcloud.service;

import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/2 14:59
 **/
public interface BreService
{
    Map getBreInfo(String tc_bre01);

    Map getRvbsInfo(String rvbs01);
}
