package com.study.java.classInitialization;

/**
 * 通过数组定义来引用类，不会触发类的初始化
 * @date: 2016/9/14 13:36
 * @author: wangfei
 */
public class ClassInitializationDemo_2 {
     public static void main(String[] args) {
         SuperClass[] classes  = new SuperClass[10];
     }
}