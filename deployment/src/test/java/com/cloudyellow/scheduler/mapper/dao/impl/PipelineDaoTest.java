package com.cloudyellow.scheduler.mapper.dao.impl;

import com.cloudyellow.scheduler.BaseTest;
import com.cloudyellow.scheduler.SchedulerApplication;
import com.cloudyellow.scheduler.mapper.PipelineMapper;
import com.cloudyellow.scheduler.model.PipelineModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @ClassName PipelineDaoTest.java
 * @Description TODO
 * @date 2019/10/512:14
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SchedulerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PipelineDaoTest extends BaseTest {
    @Autowired
    private PipelineDao dao;


    @Test
    public void findTable() {
        List<PipelineModel> modelList = dao.findAll();
        assertNotNull(modelList);
    }
}