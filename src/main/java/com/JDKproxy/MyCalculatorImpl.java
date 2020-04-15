package com.JDKproxy;

import org.springframework.stereotype.Component;

/*
 * 创建人 Baijl
 * 创建日期 2020-04-15
 * 创建时间 10:42
 * 描述：
 */
@Component
public class MyCalculatorImpl implements MyCalculator {

    public int add(int a, int b) {
        return a+b;
    }
    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
