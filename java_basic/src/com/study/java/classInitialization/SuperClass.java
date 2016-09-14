package com.study.java.classInitialization;

/**
 * @date: 2016/9/14 13:39
 * @author: wangfei
 */
public class SuperClass {
    static {
        System.out.println("super class init.");
    }
    public static int value = 123;
    public static final String HELLO_WORLD = "hello world";
}
