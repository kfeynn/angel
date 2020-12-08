package com.grand.springcloud;

//import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyq
 * @date DATE 2020/9/3 16:11
 **/
@EnableDiscoveryClient
@SpringBootApplication
//@EnableAutoDataSourceProxy
public class ConsumerEntranceMain8080
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerEntranceMain8080.class,args);
    }
}
