package com.cloudyellow.scheduler.server;

import com.cloudyellow.scheduler.model.PipelineModel;
import com.cloudyellow.scheduler.module.PipelineInfo;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @ClassName SchedulerDelegate.java
 * @Description server层抽象接口类
 * @date 2019/10/50:14
 */
public interface SchedulerDelegate {

    public String createPipeline(PipelineInfo model);

    public String getPipeLines();

    public String getPipeLine(String name);

    public String postPipeline(PipelineModel model);

    public String deletePipeline(PipelineModel model);

    public String getStatus(String name);

    public String getTaskStatus();

    public String startScheduler(PipelineModel model);

    public String stopScheduler(PipelineModel model);

    public String healthCheck();
}
