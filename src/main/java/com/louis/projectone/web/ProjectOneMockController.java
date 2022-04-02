package com.louis.projectone.web;

import com.louis.projectone.facede.api.ProjectOneMock;
import com.louis.projectone.model.request.ProjectOneMockRequest;
import com.louis.projectone.model.response.ProjectOneMockResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * LouisProjectOne
 * main.projectone.web
 * Created by luyib on 2022/4/1 20:11
 */
@RestController
@RequestMapping("/projectOne")
public class ProjectOneMockController {
    @Autowired
    private ProjectOneMock projectOneMock;

    private static final Logger logger = LoggerFactory.getLogger(ProjectOneMockController.class);

    @ResponseBody
    @RequestMapping(value = "/mock", method = RequestMethod.POST)
    public ProjectOneMockResponse projectOneMock(@RequestBody ProjectOneMockRequest projectOneMockRequest) {
        logger.info("projectOneMock receive message:\n" + projectOneMockRequest.toString());
//        return null;
//        return "test";
        return projectOneMock.getResponse(projectOneMockRequest);
    }
}
