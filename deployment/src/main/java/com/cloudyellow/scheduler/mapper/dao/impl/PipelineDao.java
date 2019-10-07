package com.cloudyellow.scheduler.mapper.dao.impl;

import com.cloudyellow.scheduler.mapper.PipelineMapper;
import com.cloudyellow.scheduler.mapper.dao.BaseDao;
import com.cloudyellow.scheduler.model.PipelineModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @ClassName PipelineServer.java
 * @Description 操作pipeline数据库的实现类
 * @date 2019/10/50:20
 */
@Component
public class PipelineDao implements BaseDao<PipelineModel> {

    @Autowired
    private PipelineMapper mapper;

    @Override
    public PipelineModel findTable(String name) {
        return mapper.selectByName(name);
    }

    @Override
    public List<PipelineModel> findAll() {
        return mapper.selectAll();
    }

    @Override
    public int createTable(PipelineModel pipeline) {
        return mapper.insertByName(pipeline);
    }

    @Override
    public int updateTable(PipelineModel pipeline) {
        return mapper.updateByNameOrid(pipeline);
    }

    @Override
    public int deleteTable(PipelineModel pipeline) {
        return mapper.deleteByName(pipeline);
    }
}
