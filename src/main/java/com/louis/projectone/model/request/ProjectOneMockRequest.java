package com.louis.projectone.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * LouisProjectOne
 * main.projectone.model.request
 * Created by luyib on 2022/4/1 19:03
 */
public class ProjectOneMockRequest {
    @NotNull
    @Size(max = 4096)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
