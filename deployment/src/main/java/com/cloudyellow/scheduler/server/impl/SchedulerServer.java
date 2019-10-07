package com.cloudyellow.scheduler.server.impl;

import com.alibaba.fastjson.JSON;
import com.cloudyellow.scheduler.config.RestRequestInfo;
import com.cloudyellow.scheduler.mapper.dao.impl.PipelineDao;
import com.cloudyellow.scheduler.mapper.dao.impl.TaskDao;
import com.cloudyellow.scheduler.model.PipelineModel;
import com.cloudyellow.scheduler.module.PipelineInfo;
import com.cloudyellow.scheduler.server.SchedulerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @ClassName SchedulerServer.java
 * @Description server层具体实现类
 * @date 2019/10/53:56
 */
@Service
public class SchedulerServer implements SchedulerDelegate {

    @Autowired
    private PipelineDao pipeline;

    @Autowired
    private TaskDao task;

    @Override
    public String createPipeline(PipelineInfo info) {
        

        return "dd";
    }

    @Override
    public String getPipeLines() {

        return JSON.toJSONString(pipeline.findAll());
    }

    @Override
    public String getPipeLine(String name) {
        return JSON.toJSONString(pipeline.findTable(name));

//        return backResult(pipeline.findTable(name))
    }

    @Override
    public String postPipeline(PipelineModel model) {
        return null;
    }

    @Override
    public String deletePipeline(PipelineModel model) {
        return null;
    }

    @Override
    public String getStatus(String name) {
        return null;
    }

    @Override
    public String getTaskStatus() {
        return null;
    }

    @Override
    public String startScheduler(PipelineModel model) {
        return null;
    }

    @Override
    public String stopScheduler(PipelineModel model) {
        return null;
    }

    @Override
    public String healthCheck() {
        return null;
    }

    public String backResult(RestRequestInfo info) {
        return JSON.toJSONString(info);
    }
}
