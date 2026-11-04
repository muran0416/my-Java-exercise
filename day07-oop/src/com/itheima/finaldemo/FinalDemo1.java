package com.itheima.finaldemo;

public class FinalDemo1 {
    // final修饰静态成员变量
    // final修饰静态变量，这个变量今后被称为常量，后续不能被修改，作为系统的配置信息
    // 常量名称需全部大写，多个单词用下划线连接
    public static final String SCHOOL_NAME = "Heima";

    // final修饰实例变量（一般没有意义）
    public final String name = "Heima";
    public static void main(String[] args) {
        // final 关键字
        // 3、final修饰变量：变量有且仅能赋值一次
        /*
            成员变量有哪些？
            成员变量：
                实例变量
                静态变量
            局部变量
        */
        final double PI = 3.14;
//        PI = 3.14159; // 第二次赋值，错误
        buy(0.9);

        FinalDemo1 f = new FinalDemo1();
//        f.name = "w3c";  // 第二次赋值，错误

        final int num = 10;
//        num = 20;  // 第二次赋值，错误

        // final 修饰引用，存储地址不能被修改
        final int[] arr = {1, 2, 3};
//        arr = new int[]{4, 5, 6};  // 第二次赋值，错误  arr是常量，不能被重新赋值
        arr[0] = 100;  // 正确，常量数组的元素可以修改
    }
    public static void buy(final double z){
//        z = 0.1; // 第二次赋值，错误
        System.out.println(z);
    }

}

// 1、final 修饰类，类不能被继承
final class A {}
//class B extends A {}

// 2、final 修饰方法，方法不能被重写  一般用于工具类
class C {
    public final void show() {
        System.out.println("final method");
    }
}
//class D extends C {
//    @Override
//    public void show() {
//        System.out.println("override method");
//    }
//}
