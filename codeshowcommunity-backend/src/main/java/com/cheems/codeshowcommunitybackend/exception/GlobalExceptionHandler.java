package com.cheems.codeshowcommunitybackend.exception;

import com.cheems.codeshowcommunitybackend.common.BaseResponse;
import com.cheems.codeshowcommunitybackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> handleBusinessException( BusinessException e) {
        log.error("business exception",e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> handlerRuntimeException(RuntimeException e){
        log.error("runtime exception",e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR.getCode(), ErrorCode.SYSTEM_ERROR.getMessage());
    }

}
