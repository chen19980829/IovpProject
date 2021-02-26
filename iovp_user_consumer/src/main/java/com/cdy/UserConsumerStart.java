package com.cdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther:二大爷
 * @Date:2021/02/27/1:15
 * @version:
 */
@EnableEurekaClient
@SpringBootApplication
public class UserConsumerStart {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerStart.class,args);
	}
}
