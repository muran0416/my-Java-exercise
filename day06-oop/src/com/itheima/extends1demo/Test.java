package com.itheima.extends1demo;

public class Test {
    public static void main(String[] args) {
        // 子类可以继承父类的非私有成员
        // 子类对象其实是由子类和父类设计图共同创建出来的,所以子类对象是完整的
        Teacher t = new Teacher();
        t.setName("Rowan");
        t.setSkill("Java Web Python");
        t.setSex('男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
