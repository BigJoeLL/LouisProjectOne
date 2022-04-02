package com.louis.projectone.service;

import com.louis.projectone.dal.dao.PO_contentDAO;
import com.louis.projectone.facede.api.ProjectOneMock;
import com.louis.projectone.facede.common.ServiceInvokeHandler;
import com.louis.projectone.model.enumeration.ResultEnum;
import com.louis.projectone.model.exception.ProjectOneException;
import com.louis.projectone.model.exception.ProjectOneParamIllegalException;
import com.louis.projectone.model.request.ProjectOneMockRequest;
import com.louis.projectone.model.response.ProjectOneMockResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * main.projectone.facade.service
 * LouisProjectOne
 * Created by luyib on 2022/4/1 19:01
 */
@Service
public class ProjectOneMockImpl implements ProjectOneMock {
    @Autowired
    ServiceTemplate serviceTemplate;

    @Autowired
    PO_contentDAO po_contentDAO;

    @Override
    public ProjectOneMockResponse getResponse(ProjectOneMockRequest projectOneMockRequest) {
        return serviceTemplate.execute(new ServiceInvokeHandler<ProjectOneMockResponse>() {
            @Override
            public void validate() {
                if (projectOneMockRequest.getContent().isEmpty()){
                    throw new ProjectOneParamIllegalException("Content cannot be null!");
                }
            }

            @Override
            public ProjectOneMockResponse execute() throws Exception {
                String content = projectOneMockRequest.getContent();
                po_contentDAO.insert(content, "11");
                ProjectOneMockResponse projectOneMockResponse = new ProjectOneMockResponse();
                projectOneMockResponse.setContent(projectOneMockRequest.getContent());
                projectOneMockResponse.setResult(ResultEnum.SUCCESS.getResult());
                return projectOneMockResponse;
            }

            @Override
            public ProjectOneMockResponse handle(ProjectOneException projectOneException) {
                String message = projectOneException.getMessage();
                if (projectOneException.getResult() != null){
                    return new ProjectOneMockResponse(projectOneException.getResult(), message);
                }else {
                    return new ProjectOneMockResponse(ResultEnum.UNKNOWN_EXCEPTION.getResult(), message);
                }
            }

            @Override
            public ProjectOneMockResponse handle(Exception exception) {
                String message = exception.getMessage();
                return new ProjectOneMockResponse(ResultEnum.UNKNOWN_EXCEPTION.getResult(), message);
            }
        });
    }
}
