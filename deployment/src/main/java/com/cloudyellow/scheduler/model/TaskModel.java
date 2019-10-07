package com.cloudyellow.scheduler.model;

import com.cloudyellow.scheduler.config.StatusType;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @ClassName TaskModel.java
 * @Description task数据库实体类
 * @date 2019/10/415:53
 */
@Data
public class TaskModel {
    private long id;
    private String taskName;
    private String taskType;
    private String taskEngine;
    private StatusType taskStatus;
    private Date createTime;
    private Date updateTime;
//    private List<DataflowModel> dataflowModels;
}
