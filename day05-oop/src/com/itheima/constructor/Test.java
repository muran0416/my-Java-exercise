package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        // 构造器的特点：创建对象时，会立即自动调用构造器
        Student s1 = new Student();
        Student s2 = new Student("张三");
        // 常见运用场景：创建对象时，可以立即为对象赋值
        Student s3 = new Student("张三", 18, '男');
    }
}
