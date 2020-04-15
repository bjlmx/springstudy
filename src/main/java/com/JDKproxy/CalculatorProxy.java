package com.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 创建人 Baijl
 * 创建日期 2020-04-15
 * 创建时间 10:43
 * 描述：
 */
public class CalculatorProxy {
    public static Object getInstance(final MyCalculatorImpl myCalculator) {
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(), myCalculator.getClass().getInterfaces(), new InvocationHandler() {
            /**
             * @param proxy 代理对象
             * @param method 代理的方法
             * @param args 方法的参数
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"方法开始执行啦...");
                Object invoke = method.invoke(myCalculator, args);
                System.out.println(method.getName()+"方法执行结束啦...");
                return invoke;
            }
        });
    }

    public static void main(String[] args) {
        MyCalculator instance = (MyCalculator) CalculatorProxy.getInstance(new MyCalculatorImpl());
        int add = instance.add(1, 4);
        System.out.println(add);
    }
}
