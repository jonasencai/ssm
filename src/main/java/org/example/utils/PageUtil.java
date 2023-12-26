package org.example.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PageUtil<T> {

    //页面大小
    private int pageSize;
    // 当前页
    private int pageNo;
    // 总量
    private  int total;
    // 每页数据
    private T pages;


    public T getPages() {
        return pages;
    }

    public void setPages(T pages) {
        this.pages = pages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
