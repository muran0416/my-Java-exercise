package com.itheima.abstract1;

public class AbstracrtDemo1 {
    public static void main(String[] args) {
        // 抽象类、抽象方法
        // 抽象类的核心特点：不能被实例化
        // 抽象类不能创建对象
//        A a = new A(); // 编译错误：无法实例化抽象类A
        // 抽象类的使命：被继承，子类去实现抽象方法
        B b = new B(); // 创建B类对象
        b.setName("张三"); // 设置名称
        b.setAge(18);
        b.show();
        System.out.println(b.getName());
    }
}
