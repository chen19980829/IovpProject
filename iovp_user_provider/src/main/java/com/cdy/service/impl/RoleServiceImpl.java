package com.cdy.service.impl;

import com.cdy.base.vo.PageVo;
import com.cdy.dao.DepartmentDao;
import com.cdy.dao.RoleDao;
import com.cdy.pojo.entity.Role;
import com.cdy.service.RoleService;
import com.cdy.until.IdGenerator;
import com.cdy.until.PageUntil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/26/19:19
 * @version:
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	@Override
	public PageVo<Role> getPageVoByQuery(Role query, PageVo<Role> pageVo) throws Exception {
		//打开PageHelper 分页过滤器
		PageHelper.startPage(pageVo.getPageNum(),pageVo.getPageSize());
		//进行列表查询
		List<Role>list=dao.findListByQuery(query);
		new PageUntil().parseFormPageInfoToPageVo(list,pageVo);
		return pageVo;
	}
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@Override
	public List<Role> getListByQuery(Role query) throws Exception {
		return dao.findListByQuery(query);
	}
	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@Override
	public Role getById(String id) throws Exception {
		Role role=new Role();
		role.setId(id);
		List<Role>list=dao.findListByQuery(role);
		if(list!=null&&list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean save(Role entity) throws Exception {
		entity.setId(idGenerator.createId());
		if(dao.save(entity)>0){
			return true;
		}
		return false;
	}
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean update(Role entity) throws Exception {
		if(dao.update(entity)>0){
			return true;
		}
		return false;
	}
}
