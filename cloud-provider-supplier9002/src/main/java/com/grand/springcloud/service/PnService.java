package com.grand.springcloud.service;

import com.grand.springcloud.entity.supplier.PN;

/**
 * @author zyq
 * @date DATE 2020/9/3 14:53
 **/
public interface PnService
{
    PN getModel(String dnnum);

}
