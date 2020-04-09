package com.it.base.common.vo;

import com.it.base.common.enums.ResultCode;
import lombok.Getter;

/**
 * @description 自定义统一响应体
 */
@Getter
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
