package com.louis.projectone.dal.dao;

import com.louis.projectone.dal.entity.PO_content;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * LouisProjectOne
 * com.louis.projectone.dal.dao
 * Created by luyib on 2022/4/2 22:42
 */
@Mapper
@Repository
public interface PO_contentDAO {
    PO_content getPoContent(int id);

    List<PO_content> queryPocontentBySearchKey(String searchKey);

    int insert(String content, String searchKey);

    int update(String content, String searchKey);
}
