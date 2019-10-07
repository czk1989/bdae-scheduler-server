package com.cloudyellow.scheduler.mapper.dao;

import java.util.List;

/**
 * @author Administrator
 * @ClassName BaseDao.java
 * @Description 针对Dao实现层定义抽象方法
 * @date 2019/10/50:19
 */
public interface BaseDao<T>{

    public List<T> findAll();

    public  T findTable(String name);

    public int createTable(T type);

    public int updateTable(T type);


    public int deleteTable(T type) ;

}
