package com.louis.projectone.facade.api;

import com.louis.projectone.model.request.ProjectOneMockRequest;
import com.louis.projectone.model.response.ProjectOneMockResponse;

/**
 * LouisProjectOne
 * main.projectone.facade.api
 * Created by luyib on 2022/4/1 19:04
 */
public interface ProjectOneMock {

    ProjectOneMockResponse getResponse(ProjectOneMockRequest projectOneMockRequest);

}
