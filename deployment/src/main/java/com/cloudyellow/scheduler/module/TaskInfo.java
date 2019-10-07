package com.cloudyellow.scheduler.module;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Administrator
 * @ClassName TaskInfo.java
 * @Description TODO
 * @date 2019/10/720:50
 */

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TaskInfo {

    @JsonProperty("name")
    private String taskName;

    @JsonProperty("from")
    private String taskIn;

    @JsonProperty("to")
    private String taskTo;

    @JsonProperty("engine")
    private String engine;

    @JsonProperty("type")
    private String taskType;
}
