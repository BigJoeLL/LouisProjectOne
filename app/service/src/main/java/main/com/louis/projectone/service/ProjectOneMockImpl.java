package main.com.louis.projectone.service;

import main.com.louis.projectone.facade.api.ProjectOneMock;
import main.com.louis.projectone.model.request.ProjectOneMockRequest;
import main.com.louis.projectone.model.response.ProjectOneMockResponse;
import org.springframework.stereotype.Service;

/**
 * main.projectone.facade.service
 * LouisProjectOne
 * Created by luyib on 2022/4/1 19:01
 */
@Service
public class ProjectOneMockImpl implements ProjectOneMock {
    @Override
    public ProjectOneMockResponse getResponse(ProjectOneMockRequest projectOneMockRequest) {
        return null;
    }
}
