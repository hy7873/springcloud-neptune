package com.hy.controller;

import com.hy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wanghai
 * @Date:2019/7/31 13:42
 * @Copyright:reach-life
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String testHello(@RequestParam(value = "name") String name) {
        return testService.testHello(name);
    }

}
