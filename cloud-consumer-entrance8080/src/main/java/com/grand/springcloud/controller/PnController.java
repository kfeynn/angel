package com.grand.springcloud.controller;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.service.GlobalOrder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/3 16:32
 **/
@Controller
public class PnController
{
    //约定这里入口 要写前端 jsp
    @Resource
    private RestTemplate restTemplate;

    //内容提供者
    @Value("${service-url.nacos-supplier-service}")
    private String supplierURL;
    @Value("${service-url.nacos-sqlserver-service}")
    private String sqlserverURL;
    @Value("${service-url.nacos-tiptop-service}")
    private String tiptopURL;

    @Resource
    GlobalOrder  globalOrder;

    @GetMapping(value = "/consumer/getPn/{dnnum}")
    @ResponseBody
    public CommonResult getPn(@PathVariable("dnnum")  String dnnum)
    {
        //System.out.println("eee");
        CommonResult result = restTemplate.getForObject(supplierURL + "/getPn/" + dnnum.toString(), CommonResult.class);
        return result;
    }

    @GetMapping(value = "/consumer/createUser/{userName}")
    @ResponseBody
    public CommonResult createUser(@PathVariable("userName")  String userName)
    {
        CommonResult result = restTemplate.getForObject(sqlserverURL+"/createUser/"+userName,CommonResult.class);
        return result;
    }

    @GetMapping(value = "/consumer/addUser/{userName}")
    @ResponseBody
    public CommonResult addUser(@PathVariable("userName")  String userName)
    {
         globalOrder.addUser(userName);

        CommonResult result = new CommonResult(200,"success");
        return result;
    }

}
