package com.echo.question.common.entity;

import com.echo.question.common.enums.ResultCode;
import lombok.Data;

@Data
public class Result<T> {
    private boolean success;

    private Integer code;

    private String message;

    private T data;

    public static Result ok(){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getDesc());
        return result;
    }

}
