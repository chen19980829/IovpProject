package com.cdy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther:二大爷
 * @Date:2021/02/23/20:00
 * @version:
 */
@EnableEurekaClient
@MapperScan("com.cdy.dao")
@SpringBootApplication
public class UserProviderStater {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderStater.class,args);
	}
}
