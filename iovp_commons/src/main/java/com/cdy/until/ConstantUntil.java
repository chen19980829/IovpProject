package com.cdy.until;

import sun.java2d.pipe.OutlineTextRenderer;

import java.net.Inet4Address;
import java.util.Properties;

/**
 * @Auther:二大爷
 * @Date:2021/02/22/21:41
 * @version:
 */
public class ConstantUntil {
	private static Properties properties=new Properties();
	static {
		try {
			properties.load(ConstantUntil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static final Integer PAGE_NUM=Integer.parseInt(properties.getProperty("page.num"));

	public static final Integer PAGE_SIZE= Integer.parseInt(properties.getProperty("page.size"));

}
