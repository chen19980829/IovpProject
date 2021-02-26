package com.cdy.until;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis操作工具类</b>
 * @Auther:二大爷
 * @Date:2021/02/27/0:37
 * @version:
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate template;
	/*
	*<b>根据Key将对应的Value存储到Redis中</b>
	*@Author:三大爷
	*/
	public boolean saveToRedis(String key,Object value)throws Exception{
		//将object类型的value变为String类型的Json
		String valueJson=JsonUntil.parseJson(value);
		template.opsForValue().set(key,valueJson);
		template.expire(key,ConstantUntil.EXPIRE_MINUTE, TimeUnit.MINUTES);

		return true;
	}
	/*
	*<b>根据key从Redis中获取数据对象</b>
	*@Author:三大爷
	*/
	public Object getFromRedis(String key,Class argClass)throws Exception{
		//根据key从Redis中获取存储的Json
		String valueJson=template.opsForValue().get(key);
		//判断所获得的valueJson是否存在
		if(valueJson!=null){
			return JsonUntil.parseToObject(valueJson,argClass);
		}else {
			return null;
		}
	}
}
