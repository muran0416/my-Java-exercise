package com.itheima.abstract2;

public class Test {
    public static void main(String[] args) {
        // 使用抽象类的好处：1. 提高代码的复用性 2. 提高代码的可维护性 3. 提高代码的扩展性
        Animal a = new Cat();
        a.cry();
    }
}
