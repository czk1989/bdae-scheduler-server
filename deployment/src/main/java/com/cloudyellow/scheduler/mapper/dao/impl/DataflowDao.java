package com.cloudyellow.scheduler.mapper.dao.impl;

import com.cloudyellow.scheduler.mapper.DataFlowMapper;
import com.cloudyellow.scheduler.mapper.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName DataflowDao.java
 * @Description TODO
 * @date 2019/10/514:56
 */
@Component
public class DataflowDao implements BaseDao {

    @Autowired
    private DataFlowMapper dataflow;

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findTable(String name) {
        return null;
    }

    @Override
    public int createTable(Object type) {
        return 0;
    }

    @Override
    public int updateTable(Object type) {
        return 0;
    }

    @Override
    public int deleteTable(Object type) {
        return 0;
    }
}
