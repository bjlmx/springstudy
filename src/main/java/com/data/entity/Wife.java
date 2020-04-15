package com.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/*
 * 创建人 Baijl
 * 创建日期 2020-04-14
 * 创建时间 15:10
 * 描述：
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Wife {
    private String name;
    private int age;
    private String address;

    public Wife() {
        this.name ="马秀";
        this.age =20;
        this.address ="山东省邹城市";
    }
}
