package com.louis.projectone.service;

import com.louis.projectone.api.ProjectOneMock;
import com.louis.projectone.model.request.ProjectOneMockRequest;
import com.louis.projectone.model.response.ProjectOneMockResponse;
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
