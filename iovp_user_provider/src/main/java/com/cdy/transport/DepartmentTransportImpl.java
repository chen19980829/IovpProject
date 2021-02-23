package com.cdy.transport;

import com.cdy.base.vo.PageVo;
import com.cdy.base.vo.QueryVo;
import com.cdy.pojo.entity.Department;
import com.cdy.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b>部门功能传输层接口实现类</b>
 * @Auther:二大爷
 * @Date:2021/02/24/1:50
 * @version:
 */
@RestController("departmentTransport")
@RequestMapping("/user/transport")
public class DepartmentTransportImpl implements DepartmentTransport{
	@Autowired
	private DepartmentService service;
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	@Override
	public PageVo<Department> getPageVoByQuery(QueryVo<Department> queryVo) throws Exception {
		return service.getPageVoByQuery(queryVo.getQuery(),queryVo.getPageVo());
	}
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@Override
	public List<Department> getListByQuery(Department query) throws Exception {
		return service.getListByQuery(query);
	}
	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@Override
	public Department getById(String id) throws Exception {
		return service.getById(id);
	}
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean save(Department entity) throws Exception {
		return service.save(entity);
	}
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean update(Department entity) throws Exception {
		return service.update(entity);
	}
}
