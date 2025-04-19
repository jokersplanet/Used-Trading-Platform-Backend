package org.example.UsedTradingPlatformBackend.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.UsedTradingPlatformBackend.common.BaseResponse;
import org.example.UsedTradingPlatformBackend.common.StatusCode;
import org.example.UsedTradingPlatformBackend.utils.ResultUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(StatusCode.SYSTEM_ERROR, "系统错误");
    }
}

