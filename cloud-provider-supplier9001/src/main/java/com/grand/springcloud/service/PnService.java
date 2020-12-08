package com.grand.springcloud.service;

import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.tiptop.PO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/3 14:53
 **/
public interface PnService
{
    PN getModel(String dnnum);

    List<LinkedHashMap<String,Object>> getOnwayPO(PO po);

}
