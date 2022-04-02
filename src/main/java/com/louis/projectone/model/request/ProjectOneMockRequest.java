package com.louis.projectone.model.request;

import com.alibaba.fastjson.JSON;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * LouisProjectOne
 * main.projectone.model.request
 * Created by luyib on 2022/4/1 19:03
 */
public class ProjectOneMockRequest implements Serializable {
    @NotNull
    @Size(max = 4096)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
