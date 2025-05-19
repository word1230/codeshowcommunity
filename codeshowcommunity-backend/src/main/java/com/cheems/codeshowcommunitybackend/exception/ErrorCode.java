package com.cheems.codeshowcommunitybackend.exception;

import lombok.Getter;

/**
 * 错误码枚举类
 */
@Getter
public enum ErrorCode {
    SUCCESS(200, "ok"),
    PARAM_ERROR(40000, "参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    NOT_AUTH_ERROR(40101, "无权限"),
    NOT_FOUND(40400, "请求数据不存在"),
    SYSTEM_ERROR(500, "系统错误"),
    ;


    private final int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
