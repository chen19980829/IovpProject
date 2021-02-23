package com.cdy.base.vo;

import com.cdy.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

/**
 * @Auther:二大爷
 * @Date:2021/02/22/23:36
 * @version:
 */
public class ResponseVo<E>implements Serializable {
	private Integer code;       //系统响应编码
	private E data;             //系统响应数据

	private ResponseVo(Integer code) {
		this.code = code;
	}

	private ResponseVo(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	/*
	*<b>获得系统响应成功视图信息</b>
	*@Author:三大爷
	*/
	public static ResponseVo successResponseVo(){
		return new ResponseVo(ResponseEnum.RESPONSE_SUCCESS.getCode());
	}
	/*
	 *<b>获得系统响应成功视图信息</b>
	 *@Author:三大爷
	 */
	public static ResponseVo successResponseVo(Object data){
		return new ResponseVo(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);
	}
	/*
	 *<b>获得系统响应失败视图信息</b>
	 *@Author:三大爷
	 */
	public static ResponseVo errorResponseVo(Object data){
		return new ResponseVo(ResponseEnum.RESPONSE_ERROR.getCode(),data);
	}
	/*
	 *<b>获得系统响应异常视图信息</b>
	 *@Author:三大爷
	 */
	public static ResponseVo exceptionResponseVo(Object data){
		return new ResponseVo(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);
	}


}
