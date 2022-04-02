package com.louis.projectone.model.exception;

import com.louis.projectone.model.common.Result;

/**
 * LouisProjectOne
 * com.louis.projectone.model.exception
 * Created by luyib on 2022/4/2 18:28
 */
public class ProjectOneException extends RuntimeException{
    protected Result result;

    public ProjectOneException(String message){
        super(message);
    }

    public ProjectOneException(Result result, String message){
        super(message);
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}
