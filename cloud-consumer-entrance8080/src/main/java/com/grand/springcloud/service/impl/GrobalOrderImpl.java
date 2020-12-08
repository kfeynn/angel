package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.service.GlobalOrder;
//import io.seata.spring.annotation.GlobalTransactional;
//import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/9/17 15:22
 **/
@Service
public class GrobalOrderImpl implements GlobalOrder
{
    @Resource
    private RestTemplate restTemplate;

    //内容提供者
    @Value("${service-url.nacos-supplier-service}")
    private String supplierURL;
    @Value("${service-url.nacos-sqlserver-service}")
    private String sqlserverURL;

    @Override
//    @GlobalTransactional(rollbackFor = Exception.class)
    public int addUser(String userName)
    {

        CommonResult result = restTemplate.getForObject(sqlserverURL+"/createUser/"+userName,CommonResult.class);
        CommonResult result1 = restTemplate.getForObject(supplierURL+"/createUser/"+userName,CommonResult.class);

        return 0;
    }

}
