package com.cdy.base.pojo.enums;

/**
 * <b>系统状态枚举信息</b>
 * @Auther:二大爷
 * @Date:2021/02/22/22:45
 * @version:
 */
public enum StatusEnum {
	STATUS_ENABLE(EnumConstant.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(EnumConstant.STATUS_DISABLE,"禁用");

	private Integer code;               //状态
	private String remark;              //说明

	private StatusEnum(Integer code, String remark) {
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
