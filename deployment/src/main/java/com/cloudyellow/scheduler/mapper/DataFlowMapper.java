package com.cloudyellow.scheduler.mapper;

import com.cloudyellow.scheduler.model.DataflowModel;
import com.cloudyellow.scheduler.model.PipelineModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName DataFlowMapper.java
 * @Description dataflow数据库的抽象层接口类
 * @date 2019/10/50:30
 */
@Component
@Mapper
public interface DataFlowMapper {
    List<DataflowModel> selectAll();
}
