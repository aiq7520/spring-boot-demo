package com.norteksoft.springbootdemo.study;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: Mr.Ge
 * @create: 2019-07-26 14:44
 * @description: 学习springboot配置文件
 **/
@Component
//@PropertySource()可以通过此注解将 person.properties 里面的值注入
//@ConfigurationProperties(prefix = "person")
@Validated//可以通过此注解直接赋值
@Getter
@Setter
@NoArgsConstructor
public class Person {
    private Long id;
    @Value("ssssssssss")
    private String name;
    @Email
    @Value("144")
    private String email;
    private Integer age;
    private Date birth;
    private List<String> pets;
    private Department dept;
    private Map<String,Object> map;

    @Override
    public String toString() {
        return "Persion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", pets=" + pets +
                ", dept=" + dept +
                ", map=" + map +
                '}';
    }

}
