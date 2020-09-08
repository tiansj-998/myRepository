package com.broada.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author tsj
 * @Date 2020/9/5 17:30
 */
@Data
@ToString
@NoArgsConstructor
public class Employee {
    private String id;
    private Long version;
    String firstName;
    String lastName;
    String age;
    String[] interests;
}
