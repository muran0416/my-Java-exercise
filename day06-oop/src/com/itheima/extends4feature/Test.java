package com.itheima.extends4feature;

public class Test {
    public static void main(String[] args) {
        // 继承的特点
        A a = new A();

    }
}
//1.java的类只能单继承,不支持多继承,但支持多层继承，即A继承B，B继承C，C继承D...
//2.一个类要么直接默认继承Object类,要么默认继承Object类,要么间接继承Object类
class A{ }

class B extends A{ }

class C extends B{ }


