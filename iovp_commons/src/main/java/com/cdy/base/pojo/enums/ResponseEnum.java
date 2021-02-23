package com.cdy.base.pojo.enums;

/**
 * <b>响应状态枚举信息</b>
 * @Auther:二大爷
 * @Date:2021/02/22/23:45
 * @version:
 */
public enum ResponseEnum {
	RESPONSE_SUCCESS(EnumConstant.RESPONSE_SUCCESS,"响应成功"),
	RESPONSE_ERROR(EnumConstant.RESPONSE_ERROR,"响应失败"),
	RESPONSE_EXCEPTION(EnumConstant.RESPONSE_EXCEPTION,"响应异常");

	private Integer code;               //状态
	private String remark;              //说明

	private ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
