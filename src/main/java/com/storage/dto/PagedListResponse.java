package com.storage.dto;

import java.util.Collections;
import java.util.List;

public class PagedListResponse<T> {
	
	private List<T> data;
	
	private Integer total;
	
	private Integer page;
	
	private Integer limit;
	
	private Integer pageSize;
	
	private Integer next;
	
	private Integer previous;	
	
	public List<T> getData() {
	    if (data == null) {
	    	data = Collections.emptyList();
	    }
	    return data;
	}
	
	public void setData(List<T> data) {
	    this.data = data;
	}
	
	public Integer getTotal() {
	    return total;
	}
	
	public void setTotal(Integer total) {
	    this.total = total;
	}
	
	public Integer getPage() {
		return page;
	}
	
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getNext() {
		return next;
	}
	
	public void setNext(Integer next) {
		this.next = next;
	}
	
	public Integer getPrevious() {
	    if (page == null || page.intValue() == 0) {
	        return null;
	    }
	    previous = (page.intValue()) - 1 ;
	    return previous;
	}
	
	public void setPrevious(Integer previous) {
		this.previous = previous;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public Integer getLimit() {
		return limit;
	}
	
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	public void calculateNext() {
	    if (total > ((page + 1) * limit)) {
	    	setNext(page + 1);
	    }
	}	
}
