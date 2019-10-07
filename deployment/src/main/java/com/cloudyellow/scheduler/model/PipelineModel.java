package com.cloudyellow.scheduler.model;

import com.cloudyellow.scheduler.config.StatusType;
import lombok.Data;

import java.sql.Date;

/**
 * @author Administrator
 * @ClassName PipelineModel.java
 * @Description pipeline数据库实体类
 * @date 2019/10/415:53
 */
@Data
public class PipelineModel {

    private long id;
    private String pipelineId;
    private String pipelineName;
    private String pipelineContext;
    private Date createTime;
    private StatusType pipelineStatus;
    private Date updateTime;
}
