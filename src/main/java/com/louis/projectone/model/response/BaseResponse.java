package com.louis.projectone.model.response;

import com.louis.projectone.model.common.Result;

import javax.validation.constraints.NotNull;

/**
 * LouisProjectOne
 * com.louis.projectone.model.response
 * Created by luyib on 2022/4/2 18:54
 */
public class BaseResponse {
    @NotNull
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    protected BaseResponse(Result result){
        this.result = result;
    }

    protected BaseResponse(Result result, String message){
        this.result = new Result(result.getResultCode(), result.getResultStatus(), message);
    }

    protected BaseResponse(){}
}
