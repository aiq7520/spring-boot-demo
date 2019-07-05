package com.norteksoft.springbootdemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="DEMO_USER")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String name;
    private Integer age;
    @Column(length = 20)
    private String password;
    private Date birthday;
    private Boolean sex;
}
