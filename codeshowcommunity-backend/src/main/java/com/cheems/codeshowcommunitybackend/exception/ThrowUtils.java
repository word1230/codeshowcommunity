package com.cheems.codeshowcommunitybackend.exception;

public class ThrowUtils {


    public static void throwIf(boolean condition,RuntimeException e) {
        if(condition){
            throw e;
        }
    }
    public static void throwIf(boolean condition,ErrorCode errorCode) {
        throwIf(condition,new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode,String message){
        throwIf(condition,new BusinessException(errorCode,message));
    }


}
