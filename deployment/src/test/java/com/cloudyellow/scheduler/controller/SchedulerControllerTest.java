package com.cloudyellow.scheduler.controller;

import com.cloudyellow.scheduler.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @ClassName SchedulerControllerTest.java
 * @Description TODO
 * @date 2019/10/513:14
 */
public class SchedulerControllerTest extends BaseTest {
//    @Autowired
//    private SchedulerController controller;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//    }
//
//    @Test
//    public void getPipeline() throws Exception {
//
//        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//        System.out.println(mvcResult.getResponse().getContentAsString());
//    }
}