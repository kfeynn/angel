package com.grand.springcloud.service;


import com.grand.springcloud.entity.mysql.StorageTbl;


/**
 * @author zyq
 * @date DATE 2020/9/3 14:53
 **/
public interface PnService
{
    StorageTbl getModel(int dnnum);

}
