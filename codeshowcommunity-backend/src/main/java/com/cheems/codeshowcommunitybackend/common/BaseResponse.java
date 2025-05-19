package com.cheems.codeshowcommunitybackend.common;

import com.cheems.codeshowcommunitybackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 *响应包装类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;
    private T data;
    private String msg;

    public BaseResponse(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public BaseResponse(int code, T data) {
       this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(),null,errorCode.getMessage());
    }

}
