package com.hy.controller;

import com.hy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wanghai
 * @Date:2019/7/30 17:27
 * @Copyright:reach-life
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test1")
    public String test1() {
        return testService.test1("wanghai");
    }

}
