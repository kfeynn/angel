package com.grand.springcloud.entity.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author zyq
 * @date DATE 2020/9/17 11:02
 **/
public class PageBean<T> implements Serializable
{
    private static final long serialVersionUID = 1L;
    private List<T> list ;       // 要返回的某一页的记录列表
    private int total;           // 总记录数
    private int pageSize ;       // 页尺寸
    private int pageIndex ;      // 当前页

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> list)
    {
        this.list = list;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    @Override
    public String toString()
    {
        return "PageBean{" +
                "list=" + list +
                ", total=" + total +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
    }
}
