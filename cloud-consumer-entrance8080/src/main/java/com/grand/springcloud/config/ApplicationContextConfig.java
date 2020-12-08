package com.grand.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyq
 * @date DATE 2020/9/3 16:29
 **/
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced  //启用负载均衡
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();

//        //设置过期时间
//        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        httpRequestFactory.setConnectionRequestTimeout(3000);
//        httpRequestFactory.setConnectTimeout(3000);
//        httpRequestFactory.setReadTimeout(3000);
//
//        return new RestTemplate(httpRequestFactory);
    }
}
