package com.grand.springcloud.service;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;

import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/13 10:10
 **/
public interface UserService
{
    boolean isExists(String userName,String passWord);

    XpGridUser getUserByUsernameAndPassword(String userUser,String passWord);

    List<XpGridFunctionsForPublic> getMenuForPublic();

    XpGridUser getUserByID(int sid);

    List<XpGridFunctions> getMenuByUid(int uid);

    Map getUserList(String userName, int pageSize, int pageNumber);

    boolean deleteUser(int userId);
}
