package com.cloudyellow.scheduler.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author Administrator
 * @ClassName RestRequestInfo.java
 * @Description TODO
 * @date 2019/10/522:10
 */
@Data
@Component
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class RestRequestInfo {
    @JsonProperty("url")
    private String url = null;

    @JsonProperty("status")
    private int status = 200;

    @JsonProperty("message")
    private String message = "OK";

    @JsonProperty("context")
    private Set context;


}
