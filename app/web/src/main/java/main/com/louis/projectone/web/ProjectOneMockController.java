package main.com.louis.projectone.web;

import main.com.louis.projectone.facade.api.ProjectOneMock;
import main.com.louis.projectone.model.request.ProjectOneMockRequest;
import main.com.louis.projectone.model.response.ProjectOneMockResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * LouisProjectOne
 * main.projectone.web
 * Created by luyib on 2022/4/1 20:11
 */
@RestController
@RequestMapping("/ProjectOne")
public class ProjectOneMockController {
    @Autowired
    private ProjectOneMock projectOneMock;

    @ResponseBody
    @RequestMapping(value = "/mock", method = RequestMethod.POST)
    public ProjectOneMockResponse projectOneMock(@RequestBody ProjectOneMockRequest projectOneMockRequest) {
//        return null;
        return projectOneMock.getResponse(projectOneMockRequest);
    }
}
