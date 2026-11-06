package com.itheima.interface1;
// 接口：使用interface关键字定义
public interface A {
    // JDK8之前，接口中只能定义常量和抽象方法
    // 1、常量：接口中定义常量可以省略public static final
//    public static final int NUM = 10;
    int NUM = 10;

    // 2、抽象方法：接口中定义方法可以省略public abstract
//    public abstract void method();
    void run();
    String go();


}
