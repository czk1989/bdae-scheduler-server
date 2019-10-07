package com.cloudyellow.scheduler;

import com.cloudyellow.scheduler.mapper.PipelineMapper;
import com.cloudyellow.scheduler.model.PipelineModel;
import jdk.internal.util.xml.impl.Input;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.io.*;
import java.util.List;

/**
 * @author Administrator
 * @ClassName SchedulerApplication.java
 * @Description 应用启动类
 * @date 2019/10/414:38
 */
@SpringBootApplication
public class SchedulerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SchedulerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //...
    }
}
