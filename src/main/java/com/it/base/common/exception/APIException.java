package com.it.base.common.exception;

import com.it.base.common.enums.ResultCode;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description 自定义异常
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class APIException extends RuntimeException {

    private int code;
    private String msg;

    public APIException(String msg) {
        this(ResultCode.FAILED.getCode(), msg);
    }


}
