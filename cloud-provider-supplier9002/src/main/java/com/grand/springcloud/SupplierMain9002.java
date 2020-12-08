package com.grand.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyq
 * @date DATE 2020/9/3 10:25
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SupplierMain9002
{
    public static void main(String[] args) {
        SpringApplication.run(SupplierMain9002.class, args);
    }
}
