package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.mapper.sqlserver.XpGridFunctionsForPublicMapperPlus;
import com.grand.springcloud.mapper.sqlserver.XpGridFunctionsMapperPlus;
import com.grand.springcloud.service.FunctionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zyq
 * @date DATE 2020/10/14 16:20
 **/
@Service
public class FunctionsServiceImpl implements FunctionsService
{
    @Resource
    XpGridFunctionsForPublicMapperPlus xpGridFunctionsForPublicMapperPlus;
    @Resource
    XpGridFunctionsMapperPlus xpGridFunctionsMapperPlus;

    @Override
    public List<XpGridFunctionsForPublic> selectList()
    {
        return xpGridFunctionsForPublicMapperPlus.selectListByUserId();
    }

    @Override
    public List<XpGridFunctions> selectListByUserId(String uid)
    {

        return xpGridFunctionsMapperPlus.selectListByUserId(Integer.valueOf(uid));
    }
}
