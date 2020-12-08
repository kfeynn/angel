package com.grand.springcloud.utils;

import com.grand.springcloud.entity.common.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/13 10:36
 **/
//@Component
@Service
public class ServiceSqlserverApi
{
    //内容提供者,
    @Value("${service-url.nacos-sqlserver-service}")
    private String sqlserverURL;

    //RestTemplate post\rest 参数类型
    //提供的服务名、参数  ,  2 参  map ，post

    public String isExists(String userName,String passWord)
    {
        return sqlserverURL+"/User/isExist";
    }

    public String getUserByUsernameAndPassword()
    {
        return sqlserverURL+"/User/getUserByNameAndPassword";
    }

    public String getMenuForPublic()
    {
        return sqlserverURL+"/User/getMenuForPublic";
    }

    public String getMenuByUid()
    {
        return sqlserverURL+"/User/getMenuByUid";
    }

    public String getUserByID(){return sqlserverURL+"/User/getUserByID";}

    /** post传递的API封装
     * url    返回地址
     * data   返回post参数
     * */
    public Map getUserList(String userName,int pageSize,int pageNumber){

        Map<String,Object> map = new HashMap();
        map.put("url",sqlserverURL + "/User/getUserList");

        Map data = new HashMap();
        data.put("userName",userName);
        data.put("pageSize",pageSize);
        data.put("pageNumber",pageNumber);

        map.put("data",data);

        return map;
    }

    public Map deleteUser(int sid)
    {
        Map<String,Object> map = new HashMap();
        map.put("url",sqlserverURL + "/User/deleteUser");

        Map data = new HashMap();
        data.put("sid",sid);

        map.put("data",data);

        return map;
    }

}
