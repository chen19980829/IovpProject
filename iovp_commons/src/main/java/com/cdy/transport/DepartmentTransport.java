package com.cdy.transport;

import com.cdy.base.vo.PageVo;
import com.cdy.base.vo.QueryVo;
import com.cdy.pojo.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>部门功能传输层接口</b>
 * @Auther:二大爷
 * @Date:2021/02/24/1:50
 * @version:
 */
@FeignClient("iovp_user_provider")
@RequestMapping("/user/transport")
public interface DepartmentTransport {
	/*
	*<b>根据查询对象分页查询</b>
	*@Author:三大爷
	*/
	@PostMapping("/page")
	PageVo<Department> getPageVoByQuery(@RequestBody QueryVo<Department> queryVo)throws Exception;
	/*
	 *<b>根据查询对象查询列表</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/list")
	List<Department> getListByQuery(@RequestBody Department query)throws Exception;

	/*
	 *<b>根据id查询对象</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/id")
	Department getById(@RequestParam String id)throws Exception;
	/*
	 *<b>保存对象信息</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/save")
	boolean save(@RequestBody Department entity)throws Exception;
	/*
	 *<b>修改对象信息</b>
	 *@Author:三大爷
	 */
	@RequestMapping("/update")
	boolean update(@RequestBody Department entity)throws Exception;


}
