package com.hy.service;

import com.hy.hystrix.ServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: wanghai
 * @Date:2019/7/31 13:38
 * @Copyright:reach-life
 * @Description:
 */
@FeignClient(name = "service-client1",fallback = ServiceHystrix.class)
public interface TestService
{
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String testHello(@RequestParam(name = "name") String name);
}
