package com.study.java.classInitialization;

/**
 * 通过子类引用父类的静态字段不会导致子类初始化
 * @date: 2016/9/14 10:07
 * @author: wangfei
 */
public class ClassInitializationDemo_1 {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
