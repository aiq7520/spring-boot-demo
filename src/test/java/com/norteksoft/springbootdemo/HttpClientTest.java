package com.norteksoft.springbootdemo;/**
 * @author: Mr.Ge
 * @create: 2019-08-26 14:57
 * @description: HttpClientTest
 **/

import org.junit.Test;

/**
 * @author: Mr.Ge
 *
 * @create: 2019-08-26 14:57
 *
 * @description: HttpClientTest
 **/
public class HttpClientTest {
    @Test
    public void test1(){
        String a = HttpClient3Utils.doGet("http://47.110.117.103:7880/list?vin=LWSRCB5KXJA000111&startTime=2019-01-29%2017:31:52&endTime=2019-02-31%2000:31:52");

    }
}
