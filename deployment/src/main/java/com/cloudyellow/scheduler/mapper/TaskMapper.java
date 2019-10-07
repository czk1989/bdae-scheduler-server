package com.cloudyellow.scheduler.mapper;

import com.cloudyellow.scheduler.model.TaskModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName TaskMapper.java
 * @Description task数据库的抽象层接口类
 * @date 2019/10/50:30
 */
@Component
@Mapper
public interface TaskMapper {
    List<TaskModel> selectAll();
}
