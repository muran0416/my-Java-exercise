package com.itheima.extends2modifier;

public class Fu {
    // 1.private(私有):只能在当前类中访问.
    private void privateMethod() {
        System.out.println("privateMethod");
    }
    // 2.default(缺省):只能在当前包中访问.
    void defaultMethod() {
        System.out.println("defaultMethod");
    }
    // 3.protected(保护):只能在当前包中访问，或者在不同包的子类中访问.
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    // 4.public(公开): anywhere
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
