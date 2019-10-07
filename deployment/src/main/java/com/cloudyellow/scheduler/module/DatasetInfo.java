package com.cloudyellow.scheduler.module;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @ClassName DatasetInfo.java
 * @Description TODO
 * @date 2019/10/720:50
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class DatasetInfo {

    @JsonProperty("source_name")
    private String sourceName;

    @JsonProperty("column")
    private List<Map<String,String>> column;

    @JsonProperty("type")
    private String datasetType;

//    @JsonProperty("aggr")
//    private String datasetAgg;
}
