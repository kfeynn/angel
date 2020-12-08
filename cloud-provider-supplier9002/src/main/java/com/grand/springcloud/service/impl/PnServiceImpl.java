package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.mapper.supplier.PNMapper;
import com.grand.springcloud.service.PnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/3 14:57
 **/
@Service
public class PnServiceImpl implements PnService
{
    @Resource
    PNMapper pnMapper;

    @Override
    public PN getModel(String dnnum)
    {
        return pnMapper.selectByPrimaryKey(dnnum);
    }
}
