package com.grand.springcloud.service;

import com.grand.springcloud.entity.tiptop.PO;

import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/19 14:29
 **/
public interface PoService
{
    Map getPOSubmitListForAll(PO po,  int pageSize,int pageNumber , int leadTime);
}
