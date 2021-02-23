package com.cdy.base.pojo.enums;

import com.cdy.until.ConstantUntil;

import java.util.Properties;

/**
 * @Auther:二大爷
 * @Date:2021/02/22/22:40
 * @version:
 */
class EnumConstant {
	private static Properties properties=new Properties();
	static {
		try {
			properties.load(EnumConstant.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static final Integer STATUS_ENABLE=Integer.parseInt(properties.getProperty("status.enable"));

	public static final Integer STATUS_DISABLE= Integer.parseInt(properties.getProperty("status.disable"));

	public static final Integer RESPONSE_SUCCESS= Integer.parseInt(properties.getProperty("response.success"));

	public static final Integer RESPONSE_ERROR= Integer.parseInt(properties.getProperty("response.error"));

	public static final Integer RESPONSE_EXCEPTION= Integer.parseInt(properties.getProperty("response.exception"));
}
