package com.cloudyellow.scheduler.mapper;


import com.cloudyellow.scheduler.model.PipelineModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName PipelineMapper.java
 * @Description pipeline数据库的抽象层接口类
 * @date 2019/10/418:42
 */
@Component
@Mapper
public interface PipelineMapper {

    List<PipelineModel> selectAll();

    PipelineModel selectByName(String pipelineName);

    int insertByName(@Param("pipeline") PipelineModel pipeline);

    int updateByNameOrid(@Param("pipeline") PipelineModel pipeline);

    int deleteByName(@Param("pipeline") PipelineModel pipeline);
}
