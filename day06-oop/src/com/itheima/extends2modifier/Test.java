package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        // 认识四种权限修饰符的修饰范围
        Fu fu = new Fu();
//        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
