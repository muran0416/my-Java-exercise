package com.itheima.interface4;

public interface A {
    //1、默认方法（普通实例方法）：必须使用default关键字修饰
    // 默认会使用public修饰
    // 使用接口的实现类的对象来调用
    default void go(){
        System.out.println("A接口中的默认方法go()");
        run();
    }

    //2、私有方法（JDK9新增）
    // 私有的实例类方法
    // 使用接口的实现类的对象来调用
    private void run(){
        System.out.println("A接口中的私有方法show()");
    }

    //3、静态方法
    // 默认会使用public修饰
    // 只能使用当前使用接口名来调用
    static void show(){
        System.out.println("A接口中的静态方法show()");
    }
}
