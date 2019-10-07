package com.cloudyellow.scheduler.module;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 * @ClassName PipelineInfo.java
 * @Description TODO
 * @date 2019/10/717:39
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class PipelineInfo {
    @JsonProperty("pipeline_name")
    private String pipelineName;

    @JsonProperty("pipeline_id")
    private String id;

    @JsonProperty("context")
    private Map context;
    @JsonProperty("dataset")
    private List<DatasetInfo> pipelineDataset;


    @JsonProperty("pipeline_task")
    private List<TaskInfo> pipelineTask;


}
