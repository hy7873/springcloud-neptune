package com.hy;

import com.hy.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudRibbonApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	public void contextLoads() {
		System.out.println(testService.test1("wanghai"));
	}

}
