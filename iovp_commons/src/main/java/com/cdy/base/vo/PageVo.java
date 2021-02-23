package com.cdy.base.vo;

import com.cdy.until.ConstantUntil;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther:二大爷
 * @Date:2021/02/22/21:30
 * @version:
 */
public class PageVo<E> implements Serializable {
	private Integer pageNum;        //当前页码
	private Integer pageSize;       //每页显示数量
	private List<E> list;           //分页列表
	private Integer draw;           //DateTables分页信息
	private Long totalCount;        //总数量
	private Integer totalPage;      //总页数

	public PageVo() {
	}

	public PageVo(Integer pageNum, Integer pageSize) {
		if(pageNum!=null&&pageNum>0){
			this.pageNum = pageNum;
		}else {
			this.pageNum= ConstantUntil.PAGE_NUM;
		}
		if(pageSize!=null&&pageSize>0){
			this.pageSize = pageSize;
		}else {
			this.pageSize= ConstantUntil.PAGE_SIZE;
		}


	}

	public PageVo(Integer pageNum, Integer pageSize,Integer draw) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = ConstantUntil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = ConstantUntil.PAGE_SIZE;
		}
		this.draw = draw;
	}

		public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
