package com.cdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>公务车信息管理注册中心启动类</b></b>
 * @Auther:二大爷
 * @Date:2021/02/22/20:34
 * @version:
 */
@EnableEurekaServer
@SpringBootApplication
public class IovpRegisterCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(IovpRegisterCenterStarter.class,args);
	}
}
