package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.mapper.CommonMapper;
import com.grand.springcloud.mapper.sqlserver.XpGridUserMapper;
import com.grand.springcloud.mapper.sqlserver.XpGridUserMapperPlus;
import com.grand.springcloud.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/4 13:28
 **/
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    XpGridUserMapper xpGridUserMapper;
    @Resource
    CommonMapper commonMapper;

    @Resource
    XpGridUserMapperPlus xpGridUserMapperPlus;

    @Override
    public XpGridUser getUserByID(int id)
    {
        return xpGridUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean isExist(String userName, String passWord)
    {
        boolean result = false;
        int i = xpGridUserMapperPlus.isExists(userName, passWord);
        if (i>0)
        {
            result = true;
        }
        return result;
    }

    @Override
    public XpGridUser getUserByNameAndPassword(String userName, String passWord)
    {
        return xpGridUserMapperPlus.selectByUserNameAndPassword(userName,passWord);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int executeSql(String cmdStr)
    {
        return commonMapper.commonSql(cmdStr);
    }

    @Override
    public int deleteUser(int sid)
    {

        return xpGridUserMapper.deleteByPrimaryKey(sid);
    }
}
