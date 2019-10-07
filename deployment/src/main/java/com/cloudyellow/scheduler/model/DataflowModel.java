package com.cloudyellow.scheduler.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @ClassName DataflowModel.java
 * @Description dataflow数据库实体类
 * @date 2019/10/415:53
 */
@Data
public class DataflowModel {
    private long id;
    private String dataflowName;
//    private String pipelienName;
//    private String taskName;
//    private String sourceIn;
//    private String sourceTo;
//    private String taskTpye;
    private Date createTime;
    private Date updateTime;

    private byte[] dataflowInfo;
}
