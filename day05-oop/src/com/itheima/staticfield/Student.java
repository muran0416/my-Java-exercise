package com.itheima.staticfield;

public class Student {
    // 静态变量：有static 修饰，属于类，类对象共享的变量，只加载一次，类加载的时候
    static String name;
    // 实例变量：没有static 修饰，属于对象，对象独享的变量，对象创建的时候
    int age;
}
