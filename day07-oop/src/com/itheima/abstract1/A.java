package com.itheima.abstract1;
// 抽象类

public abstract class A {
    private String name;
    private int age;

    public A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 抽象方法：没有方法体，只有方法签名
    public abstract void show();

    public void show1(){
        System.out.println("show1");
    }
}
