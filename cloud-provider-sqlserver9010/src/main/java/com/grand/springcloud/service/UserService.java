package com.grand.springcloud.service;

import com.grand.springcloud.entity.sqlserver.XpGridUser;

/**
 * @author zyq
 * @date DATE 2020/9/4 13:27
 **/
public interface UserService
{
    XpGridUser getUserByID(int id);

    int executeSql(String cmdStr);

    boolean isExist(String userName,String passWord);

    XpGridUser getUserByNameAndPassword(String userName,String passWord);

    int deleteUser(int sid);

}
