package com.cloudyellow.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 * @ClassName BaseTest.java
 * @Description TODO
 * @date 2019/10/512:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SchedulerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BaseTest {
    @Test
    public void demo() {
    }
}
