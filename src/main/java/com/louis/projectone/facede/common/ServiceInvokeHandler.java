package com.louis.projectone.facede.common;

import com.louis.projectone.model.exception.ProjectOneException;

/**
 * LouisProjectOne
 * com.louis.projectone.facede.common
 * Created by luyib on 2022/4/2 18:25
 */
public interface ServiceInvokeHandler<T> {
    void validate();

    T execute() throws Exception;

    T handle(ProjectOneException projectOneException);

    T handle(Exception exception);
}
