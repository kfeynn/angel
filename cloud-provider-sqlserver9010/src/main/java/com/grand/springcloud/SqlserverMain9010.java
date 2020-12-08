package com.grand.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zyq
 * @date DATE 2020/9/4 10:23
 **/
@EnableDiscoveryClient
@SpringBootApplication
//@EnableTransactionManagement(proxyTargetClass = true)
public class SqlserverMain9010
{
    public static void main(String[] args)
    {
        SpringApplication.run(SqlserverMain9010.class,args);
    }
}
