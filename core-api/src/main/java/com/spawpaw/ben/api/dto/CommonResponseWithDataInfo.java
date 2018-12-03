package com.spawpaw.ben.api.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CommonResponseWithDataInfo extends CommonResponse {

    private long currentPage;
    private long pageSize;
    private long currentPageSize;
    private long totalPages;
    private long totalRows;

    public CommonResponseWithDataInfo(int code, String msg) {
        // TODO: 添加分页信息
        super(code, msg, null);
    }
}
