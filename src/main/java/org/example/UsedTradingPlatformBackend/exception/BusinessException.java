package org.example.UsedTradingPlatformBackend.exception;

import lombok.Getter;
import org.example.UsedTradingPlatformBackend.common.StatusCode;

/**
 * 自定义异常类
 *
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(StatusCode statusCode) {
        super(statusCode.getMessage());
        this.code = statusCode.getCode();
    }

    public BusinessException(StatusCode statusCode, String message) {
        super(message);
        this.code = statusCode.getCode();
    }

}
