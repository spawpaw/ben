package com.spawpaw.ben.api.base;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;

@Data
public class BaseRestResponse implements Serializable {
    private Integer code = 0;
    private Object data;
    private String msg = "OK";

    private Long total = 1L;//所有符合筛选条件的数据量
    private Integer currentPage;//当前页
    private Integer pageSize;//当前页大小
    private Integer rows;//当前页所含的数据量

    public void withCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseRestResponse() {
    }

    public BaseRestResponse(Page data) {

        long totalElements = data.getTotalElements();
        data.getTotalPages();
        int number = data.getNumber();
        int size = data.getSize();
    }

    public BaseRestResponse withPageInfo(Long total, Integer currentPage, Integer pageSize) {
        this.total = total;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        return this;
    }
}
