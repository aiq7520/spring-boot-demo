package com.norteksoft.springbootdemo.study;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: Mr.Ge
 * @create: 2019-07-26 14:47
 * @description: 学习springboot配置文件
 **/
@Getter
@Setter
@NoArgsConstructor
public class Department {
    private String code;
    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
