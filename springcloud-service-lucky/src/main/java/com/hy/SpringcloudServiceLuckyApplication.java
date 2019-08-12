package com.hy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudServiceLuckyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServiceLuckyApplication.class, args);
	}

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/lucky")
	public String lucky() {
		return "hi, i am lucky,i am from port : " + serverPort;
	}

}
