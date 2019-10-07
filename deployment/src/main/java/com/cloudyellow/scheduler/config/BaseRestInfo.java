package com.cloudyellow.scheduler.config;

/**
 * @author Administrator
 * @ClassName BaseRestInfo.java
 * @Description TODO
 * @date 2019/10/523:44
 */
public final class BaseRestInfo {




    enum PipelineStatus{
        FAILED,
        DEACTIVE,
        ACTIVE,
        RUNING
    }


    enum ResultInfo {
        SUCCESS,
        FAILED
    }

}
