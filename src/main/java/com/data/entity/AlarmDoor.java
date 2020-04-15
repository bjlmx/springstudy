package com.data.entity;

import com.data.abstracts.Door;
import com.data.interfaces.Alarm;

/*
 * 创建人 Baijl
 * 创建日期 2020-04-14
 * 创建时间 15:34
 * 描述：
 */
public class AlarmDoor extends Door implements Alarm {
    public void open() {
        System.out.println("报警门打开");
    }

    public void close() {
        System.out.println("报警门关闭");
    }

    public void alarm() {
        System.out.println("报警门报警！");
    }
}
