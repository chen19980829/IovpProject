package com.cdy.transport;

import com.cdy.base.vo.PageVo;
import com.cdy.base.vo.QueryVo;

import com.cdy.pojo.entity.Role;

import com.cdy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/26/19:24
 * @version:
 */
@RestController("roleTransport")
@RequestMapping("/role/transport")
public class RoleTransportImpl implements RoleTransport{
	@Autowired
	private RoleService service;
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	@Override
	public PageVo<Role> getPageVoByQuery(QueryVo<Role> queryVo) throws Exception {
		return service.getPageVoByQuery(queryVo.getQuery(),queryVo.getPageVo());
	}
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@Override
	public List<Role> getListByQuery(Role query) throws Exception {
		return service.getListByQuery(query);
	}
	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@Override
	public Role getById(String id) throws Exception {
		return service.getById(id);
	}
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean save(Role entity) throws Exception {
		return service.save(entity);
	}
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	@Override
	public boolean update(Role entity) throws Exception {
		return service.update(entity);
	}
}
