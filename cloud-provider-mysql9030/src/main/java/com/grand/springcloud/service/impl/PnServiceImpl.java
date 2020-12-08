package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.mysql.StorageTbl;
import com.grand.springcloud.mapper.mysql.StorageTblMapper;
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
    StorageTblMapper pnMapper;

    @Override
    public StorageTbl getModel(int dnnum)
    {
        return pnMapper.selectByPrimaryKey(dnnum);
    }
}
