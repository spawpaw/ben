package com.spawpaw.ben.api.config;

import com.spawpaw.ben.api.dto.CommonResponse;
import com.spawpaw.ben.api.exception.ServiceException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DefaultControllerAdvice {
    @Value("${debug}")
    boolean debug;


    @ExceptionHandler({ServiceException.class})
    @ResponseBody
    public CommonResponse handException(ServiceException e) throws Exception {

        //当上级方法已指明状态码时，则交给上级方法处理
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        if (debug) {
            return new CommonResponse(e.getCode()
                    , "枚举所带的错误信息：" + e.getCodeEnum().getMsg() +
                    "\n错误信息：" + e.getMessage() +
                    "\n留给开发人员的错误信息：" + e.getMessageForDeveloper()
                    , null);
        } else {
            return new CommonResponse(e.getCode(), e.getMessage(), null);
        }

    }

}
