package com.cloudyellow.scheduler.mapper.dao.impl;

import com.alibaba.fastjson.JSON;
import com.cloudyellow.scheduler.BaseTest;
import com.cloudyellow.scheduler.model.TaskModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @ClassName TaskDaoTest.java
 * @Description TODO
 * @date 2019/10/514:02
 */
public class TaskDaoTest extends BaseTest {
    @Autowired
    private TaskDao dao;


    @Test
    public void findTable() {
        List<TaskModel> modelList = dao.findAll();
        System.out.println(JSON.toJSONString(modelList));
        assertNotNull(modelList);
    }
}