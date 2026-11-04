package com.itheima.singleinstance;
// 懒汉式单例模式
public class B {
    // 2、创建一个静态对象，用于保存创建的唯一对象
    private static B b;

    // 1、私有化构造器，防止外部通过 new 创建对象
    private B(){

    }
    // 3、提供一个公共的静态方法，用于返回唯一对象
    public static B getInstance(){
        if (b == null){
            // 第一次拿对象时，才创建对象，给静态变量b赋值
            b = new B();
        }
        return b;
    }
}
