package com.spawpaw.ben.api.dto;

import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * 为SpringData的默认PageRequest添加无参构造函数
 */
@Data
public class PageRequest implements Pageable, Serializable {
    private int page;
    private int size;
    private Sort sort;

    public PageRequest(int page, int size, Sort sort) {
        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }

        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }

        this.page = page;
        this.size = size;
        this.sort = sort;
    }

    public PageRequest(int page, int size) {
        this(page, size, Sort.unsorted());
    }

    public PageRequest() {
        this(0, 20, Sort.unsorted());
    }

    public int getPageSize() {
        return size;
    }

    public int getPageNumber() {
        return page;
    }

    public long getOffset() {
        return (long) page * (long) size;
    }

    public boolean hasPrevious() {
        return page > 0;
    }

    public Pageable previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    public Pageable next() {
        return new PageRequest(getPageNumber() + 1, getPageSize(), getSort());
    }

    public PageRequest previous() {
        return getPageNumber() == 0 ? this : new PageRequest(getPageNumber() - 1, getPageSize(), getSort());
    }

    public Pageable first() {
        return new PageRequest(0, getPageSize(), getSort());
    }

}
