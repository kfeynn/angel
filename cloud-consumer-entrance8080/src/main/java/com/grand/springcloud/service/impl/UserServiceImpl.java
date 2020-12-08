package com.grand.springcloud.service.impl;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.helper.CookieHelper;
import com.grand.springcloud.service.UserService;
import com.grand.springcloud.utils.ServiceSqlserverApi;
import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/13 10:24
 **/
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private RestTemplate restTemplate;
//    //内容提供者,
//    @Value("${service-url.nacos-sqlserver-service}")
//    private String sqlserverURL;
    @Resource
    ServiceSqlserverApi api;

    @Override
    public boolean isExists(String userName, String passWord)
    {
        boolean result = false;
        Map map = new HashMap();
        //post传递 ,准备参数
        map.put("userName",userName);
        map.put("passWord",passWord);
        String url =api.isExists(userName,passWord);

        CommonResult result1 = restTemplate.postForObject(url,map,CommonResult.class);
        if (200 == result1.getCode() && result1.getData() != null)
        {
            result = (boolean) result1.getData();
        }
        return result;
    }

    @Override
    public XpGridUser getUserByUsernameAndPassword(String userName, String passWord)
    {
        XpGridUser userModel = null;
        Map map = new HashMap();
        //post传递 ,准备参数
        map.put("userName",userName);
        map.put("passWord",passWord);
        String url =api.getUserByUsernameAndPassword();
        CommonResult result =restTemplate.postForObject(url,map,CommonResult.class);

        try
        {
            if (200 == result.getCode())
            {
                //CommonResult 泛型T转实体类
                String jsonString= JSON.toJSONString(result.getData());
                userModel = JSON.parseObject(jsonString, XpGridUser.class);

            }
        }
        catch(Exception ex)
        {
            int i = 0;
        }
        return userModel;
    }

    @Override
    public List<XpGridFunctionsForPublic>  getMenuForPublic()
    {
        List<XpGridFunctionsForPublic> menuList = null;
        String url =api.getMenuForPublic();
        CommonResult result =restTemplate.getForObject(url,CommonResult.class);

        if(result!=null && 200 == result.getCode()){
            menuList = (List<XpGridFunctionsForPublic>)result.getData();
        }
        return  menuList;
    }

    @Override
    public XpGridUser getUserByID(int sid)
    {
        XpGridUser user = null;
        String url =api.getUserByID() + "/"+sid;
        CommonResult result =restTemplate.getForObject(url, CommonResult.class);

        if(result!=null && 200 == result.getCode()){
            //user = (XpGridUser)result.getData();  //这样错，报linkedhashmap不能转XpGridUser

            //CommonResult 泛型T转实体类
            String jsonString= JSON.toJSONString(result.getData());
            user = JSON.parseObject(jsonString, XpGridUser.class);
        }
        return  user;
    }

    @Override
    public List<XpGridFunctions> getMenuByUid(int uid)
    {
        List<XpGridFunctions> menuList = null;
        String url =api.getMenuByUid(); //+"/"+String.valueOf(uid);

        Map map = new HashMap();
        //post传递 ,准备参数
        map.put("uid",uid);

        //CommonResult result =restTemplate.getForObject(url,CommonResult.class);
        CommonResult result =restTemplate.postForObject(url,map,CommonResult.class);

        if(result!=null && 200 == result.getCode()){
            menuList = (List<XpGridFunctions>)result.getData();
        }
        return  menuList;
    }

    @Override
    public Map getUserList(String userName, int pageSize, int pageNumber)
    {

        Map result = new HashMap();
        //Post 传递，有map 默认包换 url，data 两个值
        Map map  = api.getUserList(userName,pageSize,pageNumber);

        String url="";
        Map data = new HashMap();

        if(map!=null)
        {
            url = map.get("url")==null? "":map.get("url").toString();
            data = map.get("data") ==null? null:(HashMap)map.get("data");
        }

        CommonResult  commonResult = restTemplate.postForObject(url,data,CommonResult.class);
        if (commonResult !=null && 200 == commonResult.getCode() && commonResult.getData() != null)
        {
            result = (HashMap)commonResult.getData();
        }

        return result;

        //return null;
    }

    @Override
    public boolean deleteUser(int sid)
    {
        boolean result = false;
        //Post 传递，有map 默认包换 url，data 两个值
        Map map = api.deleteUser(sid);
        String url = "";
        Map data = new HashMap();
        if (map != null)
        {
            url = map.get("url") == null ? "" : map.get("url").toString();
            data = map.get("data") == null ? null : (HashMap) map.get("data");
        }
        CommonResult commonResult = restTemplate.postForObject(url, data, CommonResult.class);
        if (commonResult != null && 200 == commonResult.getCode() && commonResult.getData() != null)
        {
            result = true;
        }
        return result;
    }
}
