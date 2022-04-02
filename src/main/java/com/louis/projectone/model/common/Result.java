package com.louis.projectone.model.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * LouisProjectOne
 * com.louis.projectone.model.common
 * Created by luyib on 2022/4/2 18:55
 */
public class Result {
    @NotNull
    @Size(min = 1,
    max = 16)
    private String resultCode;

    @NotNull
    @Size(min = 1,
    max = 1)
    private String resultStatus;

    @NotNull
    @Size(min = 1,
    max = 256)
    private String resultMessage;

    public Result(String resultCode, String resultStatus, String resultMessage) {
        this.resultCode = resultCode;
        this.resultStatus = resultStatus;
        this.resultMessage = resultMessage;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public String getResultStatus() {
        return resultStatus;
    }
}
