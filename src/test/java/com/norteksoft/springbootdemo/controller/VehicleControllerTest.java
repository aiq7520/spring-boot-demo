package com.norteksoft.springbootdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@WebMvcTest(VehicleControllerTest.class)
public class VehicleControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void createVehicle() {
    }

    @Test
    public void getVehicle() {
        //mvc.perform()
    }

    @Test
    public void deleteVehicle() {
    }

    @Test
    public void updateVehicle() {
    }
}