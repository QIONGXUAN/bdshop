package com.wener.utils;

import lombok.Data;

@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> Result success(T t){
        Result result=new Result();
        result.setData(t);
        result.setMsg("success");
        result.setStatus(200);
        return result;
    }

    public static Result error(){
        Result result=new Result();
        return result;
    }
}
