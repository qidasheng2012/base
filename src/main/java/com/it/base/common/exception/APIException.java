package com.it.base.common.exception;

import com.it.base.common.enums.ResultCodeEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description 自定义异常
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class APIException extends RuntimeException {

    private Integer code;
    private String msg;

    public APIException(String msg) {
        this(ResultCodeEnum.FAILED.getCode(), msg);
    }


}
