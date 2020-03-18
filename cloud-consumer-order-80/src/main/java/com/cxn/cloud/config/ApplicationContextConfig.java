package com.cxn.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author cxn
 * @create 2020-03-16-18:15
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //赋予了restTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
