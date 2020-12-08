package com.grand.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyq
 * @date DATE 2020/9/10 8:46
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class TiptopMain9020
{
    public static void main(String[] args)
    {
        SpringApplication.run(TiptopMain9020.class,args);
    }
}
