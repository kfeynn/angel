package com.grand.springcloud;

import com.grand.springcloud.service.MesServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.xml.ws.Endpoint;

/**
 * @author zyq
 * @date DATE 2020/12/7 11:19
 * 排除数据库自动配置，此项目没有数据库
 **/

//@EnableDiscoveryClient
@SpringBootApplication
public class MesMain9040
{
    public static void main(String[] args)
    {
        SpringApplication.run(MesMain9040.class,args);

        Endpoint.publish("http://localhost:7084/service", new MesServiceImpl());
        //Endpoint.publish("http://192.168.0.64:7084/service", new MesServiceImpl());

    }
}
