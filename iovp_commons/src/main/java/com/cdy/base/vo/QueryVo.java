package com.cdy.base.vo;

import java.io.Serializable;

/**
 * <b>部门查询视图对象</b>
 * @Auther:二大爷
 * @Date:2021/02/24/1:53
 * @version:
 */
public class QueryVo<E> implements Serializable {
	private E query;            //查询对象
	private PageVo<E> pageVo;   //分页对象

	public QueryVo(E query, PageVo<E> pageVo) {
		this.query = query;
		this.pageVo = pageVo;
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVo<E> getPageVo() {
		return pageVo;
	}

	public void setPageVo(PageVo<E> pageVo) {
		this.pageVo = pageVo;
	}
}
