package com.application;

import com.JDKproxy.MyCalculatorImpl;
import com.SpringConfig;
import com.data.entity.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/*
 * 创建人 Baijl
 * 创建日期 2020-04-14
 * 创建时间 15:13
 * 描述：
 */
public class SpringTest {
    @Autowired
    private Wife wife;

    public String run() {
        return wife.getName();
    }

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-setup.xml");
        //Wife mydoor =  classPathXmlApplicationContext.getBean(Wife.class);
        //Wife [] wives=new Wife[6];
        //wives[0]=mydoor;
        //System.out.println(wives[0].getAddress());


        //使用main方法进行测试的时候
        /**
         * 1、需要加载配置类
         */
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        MyCalculatorImpl bean = annotationConfigApplicationContext.getBean(MyCalculatorImpl.class);
        System.out.println(bean.add(3,5));
    }
}
