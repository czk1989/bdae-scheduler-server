package com.cloudyellow.scheduler.controller;


import com.alibaba.fastjson.JSON;
import com.cloudyellow.scheduler.module.PipelineInfo;
import com.cloudyellow.scheduler.server.SchedulerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;

/**
 * @author Administrator
 * @ClassName SchedulerController.java
 * @Description TODO
 * @date 2019/10/54:44
 */
@RestController
@RequestMapping(value = "/bdae/v1/scheduler" )
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SchedulerController{

    @Autowired
    private SchedulerDelegate scheduler;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/pipelines")
    public String getPipeLines() {
        return scheduler.getPipeLines();
    }

    @RequestMapping(value = "/pipeline/{name}", method = RequestMethod.POST)
    public String getPipeLine(@RequestParam(value = "name") String name) throws ServerException {

        return scheduler.getPipeLine(name);
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createPipeline(@RequestBody PipelineInfo pipeline) {

        return scheduler.createPipeline(pipeline);
    }
}

