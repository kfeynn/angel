package com.grand.springcloud.controller;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/4 11:28
 **/
@RestController
public class UserController
{

    @Resource
    UserService userService;

    @RequestMapping("/createUser/{userName}")
    public CommonResult insertUser(@PathVariable("userName")  String userName)
    {
        CommonResult result = null;
        try
        {
            String cmdStr = "insert into supplierlogin(id,password,permission,name,tel,status) values('"+userName+"','"+userName+"',0,'bbb','bb',0)";
            userService.executeSql(cmdStr);
            result = new CommonResult(200, "成功9010");
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }

        return result;
    }

}
