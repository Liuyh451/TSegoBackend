package com.example.demo.common;

public class Result<T> {
    private String code;
    private String msg;
    private String token;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String gettoken() {
        return token;
    }

    public void settoken(String token) {
        this.token =token;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public static Result success(String code, String msg) {
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> success(String code, T data,String msg) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> success1(String code, String msg,T data) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> success2(String code, T data,String msg,String token) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        result.settoken(token);
        return result;
    }

    public static <T>Result<T> error1(String code, T data,String msg) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
