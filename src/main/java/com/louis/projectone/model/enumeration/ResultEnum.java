package com.louis.projectone.model.enumeration;

import com.louis.projectone.model.common.Result;

/**
 * LouisProjectOne
 * com.louis.projectone.model.common
 * Created by luyib on 2022/4/2 19:08
 */
public enum ResultEnum {
    SUCCESS("SUCCESS", "S", "Success."),
    PARAM_ILLEGAL("PARAM_ILLEGAL", "F", "Parameter Illegal."),
    UNKNOWN_EXCEPTION("UNKNOWN_EXCEPTION","U", "Unknown Exception")
    ;

    private String resultCode;
    private String  resultStatus;
    private String  resultMessage;

    ResultEnum(String resultCode, String resultStatus, String resultMessage){
        this.resultCode = resultCode;
        this.resultStatus = resultStatus;
        this.resultMessage = resultMessage;
    }

    public Result getResult(){
        return new Result(this.resultCode, this.resultStatus, this.resultMessage);
    }
}
