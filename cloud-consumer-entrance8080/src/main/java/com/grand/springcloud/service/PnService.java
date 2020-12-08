package com.grand.springcloud.service;

import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.entity.tiptop.PO;

import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/29 10:47
 **/
public interface PnService
{
    Map PnList(PN pn, PNSub pnSub,int pageSize,int pageNumber);

    Map PoList(PO po,int pageSize,int pageNumber);

}
