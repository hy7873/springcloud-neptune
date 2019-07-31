package com.hy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wanghai
 * @Date:2019/7/30 17:06
 * @Copyright:reach-life
 * @Description:
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String test1(String name) {
        String ret = restTemplate.getForObject("http://service-client1/hi?name=" + name,String.class);
        return ret;
    }

}
