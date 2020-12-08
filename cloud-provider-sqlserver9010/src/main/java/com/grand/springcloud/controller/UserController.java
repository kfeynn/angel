package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.service.FunctionsService;
import com.grand.springcloud.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/4 11:27
 **/
@RestController
@RequestMapping("/User")
public class UserController
{
    @Resource
    UserService userService;
    @Resource
    FunctionsService functionsService;

    @Resource
    RDBSHelper rdbsHelper;

    @RequestMapping(value="isExist", method=RequestMethod.POST)
    public CommonResult isExist(@RequestBody Map<String, Object> map)
    {
        CommonResult result = null;
        try
        {
            String userName = map.get("userName")==null? null:map.get("userName").toString();
            String passWord = map.get("passWord")==null? null:map.get("passWord").toString();

            boolean isExist = userService.isExist(userName,passWord);
            result = new CommonResult<>(200, "成功9010", isExist);
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010",ex.getMessage());
        }

        return result;
    }

    @RequestMapping(value="getUserByNameAndPassword", method=RequestMethod.POST)
    public CommonResult getUserByNameAndPassword(@RequestBody Map<String, Object> map)
    {
        CommonResult result = null;
        try
        {
            String userName = map.get("userName")==null? null:map.get("userName").toString();
            String passWord = map.get("passWord")==null? null:map.get("passWord").toString();

            XpGridUser user = userService.getUserByNameAndPassword(userName,passWord);
            result = new CommonResult<XpGridUser>(200, "成功9010", user);
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }
        return result;
    }

    @RequestMapping("/getMenuForPublic")
    public CommonResult getMenuForPublic()
    {
        CommonResult result = null;
        try
        {
            List<XpGridFunctionsForPublic> menuList = functionsService.selectList();
            result = new CommonResult<>(200, "成功9010", menuList);
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }
        return result;
    }

    //@RequestMapping("/getMenuByUid")
    @RequestMapping(value="getMenuByUid", method=RequestMethod.POST)
    public CommonResult getMenuByUid(@RequestBody Map<String, Object> map)
    {
        CommonResult result  ;
        try
        {
            String uid = map.get("uid") == null ? null : map.get("uid").toString();
            List<XpGridFunctions> menuList = functionsService.selectListByUserId(uid);
            result = new CommonResult<>(200, "成功9010", menuList);
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }
        return result;
    }

    @RequestMapping("/getUserByID/{uid}")
    public CommonResult getUserByID(@PathVariable("uid")  int uid)
    {
        CommonResult result = null;
        try
        {
            XpGridUser user = userService.getUserByID(uid);

            result = new CommonResult<XpGridUser>(200, "成功9010", user);

        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }

        return result;
    }

    @RequestMapping("/createUser/{userName}")
    public CommonResult insertUser(@PathVariable("userName")  String userName)
    {
        CommonResult result = null;
        try
        {
            String cmdStr = "insert into xpGrid_User(UserName,UserCName,[Password],deleted) values('"+userName+"','"+userName+"','bbb',0)";
            userService.executeSql(cmdStr);
            result = new CommonResult(200, "成功9010");
        }
        catch (Exception ex)
        {
            result = new CommonResult(400, "失败9010");
        }

        return result;
    }



    //@RequestBody Map<String, Object> mapq
    @RequestMapping(value="getUserList", method=RequestMethod.POST)
    public CommonResult getUserList(@RequestBody Map<String, Object> map)
    {
        //普通 分页查询 ，返回 list && totalRecord
        CommonResult commonResult = null;
        try
        {
            //获取传入的参数
            String userName = map.get("userName") == null ? null : JSON.parseObject(JSON.toJSONString(map.get("userName")), String.class);
            //尺寸、页码
            int pageSize = map.get("pageSize") == null ? 15 : (int) map.get("pageSize");
            int pageNumber = map.get("pageNumber") == null ? 1 : (int) map.get("pageNumber");
            //获取数据
            int totalpage = 0;
            int totalRecord = 0;
            Map rmap = rdbsHelper.ExecutePaging("xpGrid_User", "*", "userid asc", "1=1", pageSize, pageNumber, totalpage, totalRecord);
            List<XpGridUser> list = (List<XpGridUser>) rmap.get("list");
            totalRecord = (int) rmap.get("totalRecord");
            //准备返回数据
            Map result = new HashMap();
            result.put("list", list);
            result.put("totalRecord", totalRecord);

            commonResult = new CommonResult<>(200, "成功", result);
        }catch (Exception ex)
        {
            commonResult = new CommonResult<>(400, "失败");
        }
        return commonResult;
    }

    //deleteUser
    @RequestMapping(value="deleteUser", method=RequestMethod.POST)
    public CommonResult deleteUser(@RequestBody Map<String, Object> map)
    {
        //普通 分页查询 ，返回 list && totalRecord
        CommonResult commonResult = null;
        try
        {
            //获取传入的参数
            int sid = map.get("sid") == null ? 0 : (int) map.get("sid");

            //删除用户 ById
            userService.deleteUser(sid);

            commonResult = new CommonResult<>(200, "成功");
        }catch (Exception ex)
        {
            commonResult = new CommonResult<>(400, "失败");
        }
        return commonResult;
    }

}
