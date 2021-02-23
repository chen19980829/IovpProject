package com.cdy.pojo.entity;

import com.cdy.base.pojo.entity.BaseEntity;

/**
 * <b>部门实体信息</b>
 * @Auther:二大爷
 * @Date:2021/02/23/23:02
 * @version:
 */
public class Department extends BaseEntity {
	private String id;          //主键
	private String name;        //部门名称
	private String code;        //部门编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
