package com.study.java.classInitialization;

/**
 * 常量在编译阶段会存入调用类的常量池中，没有直接引用到定义常量的类，
 * 不会触发定义常量的类的初始化
 * @date: 2016/9/14 13:36
 * @author: wangfei
 */
public class ClassInitializationDemo_3 {
     public static void main(String[] args) {
         System.out.println(SuperClass.HELLO_WORLD);
     }
}