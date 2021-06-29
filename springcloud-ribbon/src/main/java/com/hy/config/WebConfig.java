package com.hy.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: wanghai
 * @Date:2021/6/29 11:06
 * @Copyright:www.letus.com
 * @Description:
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 启动负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * 负载均衡策略
     * @return
     */
    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }

}
