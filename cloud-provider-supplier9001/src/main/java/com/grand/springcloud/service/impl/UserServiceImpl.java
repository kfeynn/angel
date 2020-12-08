package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.mapper.CommonMapper;
import com.grand.springcloud.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/17 15:50
 **/
@Service
public class UserServiceImpl implements UserService
{

    @Resource
    CommonMapper commonMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int executeSql(String cmdStr)
    {
        return commonMapper.commonSql(cmdStr);
    }
}
