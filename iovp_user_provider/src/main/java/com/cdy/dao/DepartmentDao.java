package com.cdy.dao;

import com.cdy.pojo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门信息持久层接口
 * @Auther:二大爷
 * @Date:2021/02/23/23:43
 * @version:
 */
@Repository
public interface DepartmentDao {
	/*
	*<b>根据查询对象查询列表表</b>
	*@Author:三大爷
	*/
	List<Department>findListByQuery(Department query)throws Exception;
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	int save(Department entity)throws Exception;

	/*
	*<b>修改对象信息</b>
	*@Author:三大爷
	*/
	int update(Department entity)throws Exception;
}
