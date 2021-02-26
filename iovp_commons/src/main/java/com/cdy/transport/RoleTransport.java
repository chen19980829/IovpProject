package com.cdy.transport;

import com.cdy.base.vo.PageVo;
import com.cdy.base.vo.QueryVo;
import com.cdy.pojo.entity.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/26/19:30
 * @version:
 */
@FeignClient("iovp_user_provider")
@RequestMapping("/role/transport")
public interface RoleTransport {
	/*
	 *<b>根据查询对象分页查询</b>
	 *@Author:三大爷
	 */
	@PostMapping("/page")
	PageVo<Role> getPageVoByQuery(@RequestBody QueryVo<Role> queryVo)throws Exception;
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/list")
	List<Role> getListByQuery(@RequestBody Role query)throws Exception;

	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/id")
	Role getById(@RequestParam String id)throws Exception;
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/save")
	boolean save(@RequestBody Role entity)throws Exception;
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/update")
	boolean update(@RequestBody Role entity)throws Exception;

}
