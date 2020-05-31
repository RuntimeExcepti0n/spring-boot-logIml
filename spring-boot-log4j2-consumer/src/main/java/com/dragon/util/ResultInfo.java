package com.dragon.util;


import java.io.Serializable;

public class ResultInfo<T> implements Serializable {
    private String code;
    private  String massage;
    private T data;

    public ResultInfo() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
