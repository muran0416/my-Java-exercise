package com.itheima.constructor;

public class Student {
    String name;
    int age;
    char sex;
    // 1.无参数构造器
    // 构造器：是一种特殊方法，不能返回值，方法名必须与类名相同
    public Student(){
        System.out.println("无参数构造器执行了...");
    }
    // 2.有参数构造器
    public Student(String name){
        System.out.println("有参数构造器执行了...");
    }
    public Student(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
