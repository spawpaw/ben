package com.spawpaw.ben.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResponse implements Serializable {
    private int code;
    private String msg;

    private Object data;

    public CommonResponse(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
