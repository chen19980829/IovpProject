package com.cdy.until;

import com.cdy.base.vo.PageVo;
import com.cdy.pojo.entity.Department;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <b>分页工具类</b>
 * @Auther:二大爷
 * @Date:2021/02/24/1:26
 * @version:
 */
public class PageUntil<E>{
	public void parseFormPageInfoToPageVo(List<E> list, PageVo<E>pageVo){
		//创建PageInfo对象
		PageInfo<E> pageInfo=new PageInfo<E>(list);
		//从PageInfo中提取数据
		pageVo.setList(pageInfo.getList());
		pageVo.setTotalCount(pageInfo.getTotal());
		pageVo.setTotalPage(pageInfo.getPages());
	}
}
