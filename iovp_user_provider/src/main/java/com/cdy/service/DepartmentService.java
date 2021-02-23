package com.cdy.service;


import com.cdy.base.vo.PageVo;

import com.cdy.pojo.entity.Department;

import java.util.List;

/**
 * <b>部门功能业务层接口</b>
 * @Auther:二大爷
 * @Date:2021/02/24/0:31
 * @version:
 */
public interface DepartmentService {
	/*
	*<b>根据查询对象分页查询</b>
	*@Author:三大爷
	*/
	PageVo<Department> getPageVoByQuery(Department query, PageVo<Department> pageVo)throws Exception;
	/*
	*<b>根据查询对象查询列表</b>
	*@Author:三大爷
	*/
	List<Department> getListByQuery(Department query)throws Exception;

	/*
	*<b>根据id查询对象</b>
	*@Author:三大爷
	*/
	Department getById(String id)throws Exception;
	/*
	*<b>保存对象信息</b>
	*@Author:三大爷
	*/
	boolean save(Department entity)throws Exception;
	/*
	*<b>修改对象信息</b>
	*@Author:三大爷
	*/
	boolean update(Department entity)throws Exception;
}
