package com.itheima.staticmethod;

public class Test {
    static void main(String[] args) {
        // 1.类名.方法名（推荐）
        Student.printHelloWorld();

        // 2.对象名.方法名（不推荐）
        Student s1 = new Student();
        s1.printHelloWorld();

        // 3.对象名.实例方法
        s1.setScore(59.5);
        s1.printPass();

        // 规范：如果这个方法只是为了做一个功能且不需要直接访问对象数据，这个方法直接定义成静态方法
        //  如果这个方法需要访问对象数据，这个方法必须定义成实例方法

    }
}
