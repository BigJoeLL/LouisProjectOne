package com.louis.projectone.service;

import com.louis.projectone.facede.common.ServiceInvokeHandler;
import com.louis.projectone.model.exception.ProjectOneException;
import org.springframework.stereotype.Service;

/**
 * LouisProjectOne
 * com.louis.projectone.service
 * Created by luyib on 2022/4/2 18:22
 */
@Service
public class ServiceTemplate {
    public <T> T execute(ServiceInvokeHandler<T> serviceInvokeHandler) {
        T result = null;
        try {
            serviceInvokeHandler.validate();

            result = serviceInvokeHandler.execute();

            return result;
        } catch (ProjectOneException projectOneException) {
            return serviceInvokeHandler.handle(projectOneException);
        } catch (Exception exception) {
            return serviceInvokeHandler.handle(exception);
        }
    }
}
