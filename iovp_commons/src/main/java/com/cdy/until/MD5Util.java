package com.cdy.until;

import java.security.MessageDigest;

/*
*<b>MD5 加密工具类</b>
*@Author:三大爷
*/
public class MD5Util {
	private static final String KEY_MD5 = "MD5";

	/**
	 * <b>对给定的字符串进行 MD5 加密</b>
	 * @param message
	 * @return
	 */
	public static String encrypt(String message) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			byte[] inputData = message.getBytes("UTF-8");
			byte[] encryptionData = md.digest(inputData);
			for (int i = 0; i < encryptionData.length; i++) {
				int value = ((int) encryptionData[i]) & 0xff;
				if (value < 16) {
					sb.append("0");
				}
				sb.append(Integer.toHexString(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString().toUpperCase();
	}
}
