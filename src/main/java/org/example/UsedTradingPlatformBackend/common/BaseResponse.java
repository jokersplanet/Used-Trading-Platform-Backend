package org.example.UsedTradingPlatformBackend.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    private BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code) {
        this(code, null, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(int code, String message) { this(code, null, message); }

    public BaseResponse(StatusCode statusCode) {
        this(statusCode.getCode(), null, statusCode.getMessage());
    }

    public BaseResponse(StatusCode statusCode, String message) {
        this(statusCode.getCode(), null, message);
    }

    public BaseResponse(StatusCode statusCode, T data, String message) {
        this(statusCode.getCode(), data, message);
    }
}

