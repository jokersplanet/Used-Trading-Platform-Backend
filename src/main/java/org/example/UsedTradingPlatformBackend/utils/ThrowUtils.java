package org.example.UsedTradingPlatformBackend.utils;

import org.example.UsedTradingPlatformBackend.common.StatusCode;
import org.example.UsedTradingPlatformBackend.exception.BusinessException;

public class ThrowUtils {

    /**
     * 条件成立则抛异常
     *
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition 条件
     * @param statusCode 状态码
     */
    public static void throwIf(boolean condition, StatusCode statusCode) {
        throwIf(condition, new BusinessException(statusCode));
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition  条件
     * @param statusCode 状态码
     * @param message 信息
     */
    public static void throwIf(boolean condition, StatusCode statusCode, String message) {
        throwIf(condition, new BusinessException(statusCode, message));
    }
}
