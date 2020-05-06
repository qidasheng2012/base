package com.it.base.common.vo;

import com.it.base.common.enums.ResultCodeEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @description 自定义统一响应体
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    public ResultVO(T data) {
        this(ResultCodeEnum.SUCCESS, data);
    }

    public ResultVO(ResultCodeEnum resultCodeEnum, T data) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
        this.data = data;
    }
}
