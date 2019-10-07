package com.cloudyellow.scheduler.mapper.dao.impl;

import com.cloudyellow.scheduler.mapper.TaskMapper;
import com.cloudyellow.scheduler.mapper.dao.BaseDao;
import com.cloudyellow.scheduler.model.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName TaskDao.java
 * @Description 操作task数据库的实现类
 * @date 2019/10/50:29
 */
@Component
public class TaskDao implements BaseDao <TaskModel> {

    @Autowired
    private TaskMapper task;

    @Override
    public List<TaskModel> findAll() {
        return task.selectAll();
    }

    @Override
    public TaskModel findTable(String name) {
        return null;
    }

    @Override
    public int createTable(TaskModel type) {
        return 0;
    }

    @Override
    public int updateTable(TaskModel type) {
        return 0;
    }

    @Override
    public int deleteTable(TaskModel type) {
        return 0;
    }
}
