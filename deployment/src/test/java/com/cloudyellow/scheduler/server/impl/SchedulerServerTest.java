package com.cloudyellow.scheduler.server.impl;

import com.cloudyellow.scheduler.BaseTest;
import com.cloudyellow.scheduler.model.PipelineModel;
import com.cloudyellow.scheduler.server.SchedulerDelegate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @ClassName SchedulerServerTest.java
 * @Description TODO
 * @date 2019/10/512:53
 */
public class SchedulerServerTest extends BaseTest {
    @Autowired
    SchedulerDelegate server;
    @Test
    public void demo() {
        String modelList = server.getPipeLines();
        System.out.println(modelList);
        assertNotNull(modelList);
    }
}