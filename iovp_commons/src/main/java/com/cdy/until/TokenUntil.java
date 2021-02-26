package com.cdy.until;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统Token工具类</b>
 * @Auther:二大爷
 * @Date:2021/02/27/0:15
 * @version:
 */
public class TokenUntil {
	private static Algorithm algorithm=Algorithm.HMAC256(ConstantUntil.SECRET_KEY);
	/*
	*<b>使用主键id生成Token信息</b>
	*@Author:三大爷
	*/
	public static String createToken(String id){
		try {
			// 设置头部消息
			Map<String, Object> headerMap = new HashMap<String, Object>();
			headerMap.put("Type", "jwt");
			headerMap.put("alg", "HMAC256");
			//获得过期时间
			Integer expire=ConstantUntil.EXPIRE_MINUTE;
			//根据过期时间计算过期时间的Date类型
			Date expireDate=new Date(new Date().getTime()+expire*60*1000);
			// 设置生成的Token信息
			return JWT.create()
					.withHeader(headerMap)
					.withClaim("id", id)
					.withExpiresAt(expireDate)
					.sign(algorithm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * <b>校验Token是否正确，并且获得对应的用户id</b>
	 * @param token
	 * @return
	 */
	public static String verifyToken(String token) {
		try {
			JWTVerifier verifier = JWT.require(algorithm).build();
			DecodedJWT jwt = verifier.verify(token);
			return jwt.getClaim("id").asString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
