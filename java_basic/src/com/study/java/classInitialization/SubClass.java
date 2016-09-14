package com.study.java.classInitialization;

/**
 * @date: 2016/9/14 13:39
 * @author: wangfei
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("suber class init.");
    }
}
