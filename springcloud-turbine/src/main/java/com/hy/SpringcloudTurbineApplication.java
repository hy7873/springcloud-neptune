package com.hy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbineStream
@EnableTurbine
public class SpringcloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTurbineApplication.class, args);
	}

}
