package com.hy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SpringcloudZipkinClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinClientApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/test/test1")
	public String test1(@RequestParam(value = "name") String name) {
		String ret = restTemplate.getForObject("http://service-client1/hi?name=" + name,String.class);
		return ret;
	}

}
