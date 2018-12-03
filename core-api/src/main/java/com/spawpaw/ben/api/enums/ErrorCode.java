package com.spawpaw.ben.api.enums;

public enum ErrorCode {
    ERR_ILLIGAL_ARGUMENT(400, "参数错误"),

    ERR_INTERAL_SERVER_ERROR(500, "内部错误");

    /**
     * 错误代码
     */
    private int code;
    /**
     * 用于展现给客户的信息
     */
    private String msg;

    /**
     * @param code 错误代码
     * @param msg  用于展现给客户的信息
     */
    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public ErrorCode setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ErrorCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
