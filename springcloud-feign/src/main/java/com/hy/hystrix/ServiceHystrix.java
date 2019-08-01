package com.hy.hystrix;

import com.hy.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @Author: wanghai
 * @Date:2019/8/1 11:23
 * @Copyright:reach-life
 * @Description:
 */
@Component
public class ServiceHystrix implements TestService{

    @Override
    public String testHello(String name) {
        return "sorry " + name + ", service error !!!";
    }
}
