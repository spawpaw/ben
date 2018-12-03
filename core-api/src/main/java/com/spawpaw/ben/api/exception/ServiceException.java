package com.spawpaw.ben.api.exception;

import com.spawpaw.ben.api.enums.ErrorCode;

/**
 * Created By spawpaw@hotmail.com  2018-08-22
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public class ServiceException extends RuntimeException {
    private ErrorCode codeEnum;
    private String messageForDeveloper;

    private ServiceException() {
    }

    /**
     * @param codeEnum            错误枚举
     * @param messageForDeveloper 留给开发人员看的错误提示
     */
    public ServiceException(ErrorCode codeEnum, String messageForDeveloper) {
        this(codeEnum, codeEnum.getMsg(), messageForDeveloper);
    }

    /**
     * @param codeEnum            错误枚举
     * @param message             留给客户看的错误信息，覆盖ErrorCode中的信息
     * @param messageForDeveloper 留给开发人员看的错误信息
     */
    public ServiceException(ErrorCode codeEnum, String message, String messageForDeveloper) {
        super(message);
        this.codeEnum = codeEnum;
        this.messageForDeveloper = messageForDeveloper;
    }

    /**
     * 获取错误编码
     *
     * @return 错误代码
     */
    public int getCode() {
        return codeEnum.getCode();
    }

    /**
     * 获取错误枚举
     *
     * @return 错误枚举
     */
    public ErrorCode getCodeEnum() {
        return codeEnum;
    }

    /**
     * 获取用于开发人员调试的信息
     *
     * @return 留给开发人员看的错误信息
     */
    public String getMessageForDeveloper() {
        return messageForDeveloper;
    }

    /**
     * @return 返回
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
