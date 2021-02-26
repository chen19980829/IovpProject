package com.cdy.service;

import com.cdy.base.vo.PageVo;

import com.cdy.pojo.entity.Role;

import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/26/19:09
 * @version:
 */
public interface RoleService {
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	PageVo<Role> getPageVoByQuery(Role query, PageVo<Role> pageVo)throws Exception;
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	List<Role> getListByQuery(Role query)throws Exception;

	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	Role getById(String id)throws Exception;
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	boolean save(Role entity)throws Exception;
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	boolean update(Role entity)throws Exception;
}
