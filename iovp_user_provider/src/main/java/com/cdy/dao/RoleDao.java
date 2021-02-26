package com.cdy.dao;

import com.cdy.pojo.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/26/19:04
 * @version:
 */
@Repository
public interface RoleDao {
	/*
	 *<b>根据查询对象查询列表表</b>
	 *@Author:三大爷
	 */
	List<Role> findListByQuery(Role query)throws Exception;
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	int save(Role entity)throws Exception;

	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	int update(Role entity)throws Exception;
}
