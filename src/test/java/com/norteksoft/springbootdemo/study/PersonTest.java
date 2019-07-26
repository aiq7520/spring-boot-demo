package com.norteksoft.springbootdemo.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    private Person person;
    @Test
    public void testStart(){
        System.out.println(ioc.containsBean("person"));
        System.out.println(ioc.getBean("person"));
    }

}