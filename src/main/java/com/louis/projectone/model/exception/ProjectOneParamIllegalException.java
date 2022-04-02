package com.louis.projectone.model.exception;

import com.louis.projectone.model.enumeration.ResultEnum;

/**
 * LouisProjectOne
 * com.louis.projectone.model.exception
 * Created by luyib on 2022/4/2 19:05
 */
public class ProjectOneParamIllegalException extends ProjectOneException{
    public ProjectOneParamIllegalException(String message) {
        super(message);
        this.result = ResultEnum.PARAM_ILLEGAL.getResult();
    }
}
