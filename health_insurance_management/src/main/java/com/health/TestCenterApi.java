package com.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
public class TestCenterApi {

	public static void main(String[] args) {
		SpringApplication.run(TestCenterApi.class, args);
	}
}
