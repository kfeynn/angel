package com.grand.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyq
 * @date DATE 2020/9/21 15:00
 **/
@EnableDiscoveryClient
@SpringBootApplication
//public class MysqlMain9030
//{
//    public static void main(String[] args)
//    {
//        SpringApplication.run(MysqlMain9030.class,args);
//    }
//}


//打war包时用这个
public class MysqlMain9030 extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(MysqlMain9030.class, args);
		//webservice 发布(一个或多个)，也可以用config类配置（一个）
		//Endpoint.publish("http://localhost:9999/service/user/", new UserServiceImpl());
		//Endpoint.publish("http://localhost:9999/service/role/", new RoleServiceImpl());
	}
	//重写configure方法，打war包时用
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MysqlMain9030.class);
	}
}
