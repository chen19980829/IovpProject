package com.cdy.until;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * <b>Json转换工具类</b>
 * @Auther:二大爷
 * @Date:2021/02/23/0:43
 * @version:
 */
public class JsonUntil {
	/**
	 * <b>将对象转换为Json格式</b>
	 * @Auther:二大爷
	 * @Date:2021/02/23/0:43
	 * @version:
	 */
	public static String parseJson(Object obj){
		JsonMapper jsonMapper=new JsonMapper();
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}
	/**
	 * <b>Json转换为指定的对象格式</b>
	 * @Auther:二大爷
	 * @Date:2021/02/23/0:43
	 * @version:
	 */
	public static Object parseToObject(String json,Class argClass){
		JsonMapper jsonMapper=new JsonMapper();
		try {
			return jsonMapper.readValue(json,argClass);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
