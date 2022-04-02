package com.louis.projectone.model.response;

import com.louis.projectone.model.common.Result;

/**
 * LouisProjectOne
 * main.projectone.model.response
 * Created by luyib on 2022/4/1 19:03
 */
public class ProjectOneMockResponse extends BaseResponse{
    private String content;

    public ProjectOneMockResponse(Result result) {
        super(result);
    }

    public ProjectOneMockResponse() {
    }

    public ProjectOneMockResponse(Result result, String message) {
        super(result, message);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
