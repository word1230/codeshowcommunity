package com.cheems.codeshowcommunitybackend.common;

import com.cheems.codeshowcommunitybackend.exception.ErrorCode;
import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * 响应包装工具类
 * @param <T>
 */
public class ResultUtils<T> {

    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(200,data,"ok");
    }


    public static <T> BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }
    public static <T> BaseResponse<T> error(int code, String message){
        return new BaseResponse<>(code,null,message);
    }




    public static <T> BaseResponse<T> error( ErrorCode errorCode,String message){
        return new BaseResponse<>(errorCode.getCode(),null,message);
    }



}
