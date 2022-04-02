package com.louis.projectone.dal.entity;

import lombok.Data;

import java.sql.Date;

/**
 * LouisProjectOne
 * com.louis.projectone.dal.entity
 * Created by luyib on 2022/4/2 22:40
 */
@Data
public class PO_content {
    private int id;

    private String content;

    private String search_key;

    private Date time_created;

    private Date  time_modified;
}
