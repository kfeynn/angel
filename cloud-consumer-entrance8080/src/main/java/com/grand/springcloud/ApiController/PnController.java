package com.grand.springcloud.ApiController;

import com.grand.springcloud.entity.common.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/3 17:25
 **/
//controller加名称区别
@RestController("API")
@RequestMapping("/API/Pn")
public class PnController
{
    //约定 统一对外（程序）提供服务入口 。前缀API
    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-supplier-service}")
    private String serverURL;
    @GetMapping(value = "/consumer/getPn/{dnnum}")
    public CommonResult getPn(@PathVariable("dnnum")  String dnnum)
    {
        CommonResult result = restTemplate.getForObject(serverURL + "/getPn/" + dnnum.toString(), CommonResult.class);
        return result;
    }
}