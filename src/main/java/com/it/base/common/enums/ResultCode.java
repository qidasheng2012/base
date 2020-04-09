package com.it.base.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description 响应码枚举
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResultCode {

    SUCCESS(200, "操作成功"),

    FAILED(400, "响应失败"),

    VALIDATE_FAILED(402, "参数校验失败"),

    ERROR(500, "未知错误");

    private int code;
    private String msg;

}
