package com.cdy.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 * @Auther:二大爷
 * @Date:2021/02/22/22:30
 * @version:
 */
public class BaseEntity implements Serializable {
	private Integer status;
	private Long createUser;
	private Date createTime;
	private Long updateUser;
	private Date updateTime;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
