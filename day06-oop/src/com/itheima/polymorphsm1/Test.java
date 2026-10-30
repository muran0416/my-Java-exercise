package com.itheima.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        // 前提：继承/实现关系；存在父类引用子类对象；存在方法重写
        // 对象多态，行为多态
        Animal S1 = new Wolf();
        S1.run(); // 方法：编译看左边，运行看右边
        System.out.println(S1.name); // 成员变量：编译看左边，运行看左边

        Animal S2 = new Tortoise();
        S2.run();
        System.out.println(S2.name);

    }
}
