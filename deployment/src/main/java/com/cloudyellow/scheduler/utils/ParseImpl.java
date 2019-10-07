package com.cloudyellow.scheduler.utils;

import com.cloudyellow.scheduler.module.PipelineInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @ClassName ParseImpl.java
 * @Description TODO
 * @date 2019/10/722:00
 */
public class ParseImpl {

    @Autowired
    private PipelineInfo info;
    public ParseImpl(PipelineInfo info) {
        this.info = info;
    }




}
