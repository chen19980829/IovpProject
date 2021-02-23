package com.cdy.service.impl;

import com.cdy.base.vo.PageVo;
import com.cdy.dao.DepartmentDao;
import com.cdy.pojo.entity.Department;
import com.cdy.service.DepartmentService;
import com.cdy.until.IdGenerator;
import com.cdy.until.PageUntil;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>部门功能业务层接口实现类</b>
 * @Auther:二大爷
 * @Date:2021/02/24/1:07
 * @version:
 */
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	@Override
	public PageVo<Department> getPageVoByQuery(Department query, PageVo<Department> pageVo) throws Exception {
		//打开PageHelper 分页过滤器
		PageHelper.startPage(pageVo.getPageNum(),pageVo.getPageSize());
		//进行列表查询
		List<Department>list=dao.findListByQuery(query);
		new PageUntil().parseFormPageInfoToPageVo(list,pageVo);
		return pageVo;
	}
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@Override
	public List<Department> getListByQuery(Department query) throws Exception {
		return dao.findListByQuery(query);
	}
	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@Override
	public Department getById(String id) throws Exception {
		Department department=new Department();
		department.setId(id);
		List<Department>list=dao.findListByQuery(department);
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
	public boolean save(Department entity) throws Exception {
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
	public boolean update(Department entity) throws Exception {
		if(dao.update(entity)>0){
			return true;
		}
		return false;
	}
}
