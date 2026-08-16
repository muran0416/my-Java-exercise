package com.itheima.staticmethod;

public class Test4 {
    // 静态变量
    public static int count = 100;
    // 静态方法
    public static void printHelloWord2(){
        System.out.println("Hello World!");
    }
    // 实例变量
    private String name; // 实例变量
    // 实例方法
    public void run(){

    }

    public static void main(String[] args) {
       // 目标：搞清楚静态方法，实例方法的几点注意事项
        printHelloWord();

    }
    // 静态方法中不能直接调用实例方法
    public static void printHelloWord(){
        System.out.println(count);
        printHelloWord2();
//        System.out.println(name); // 实例变量不能在静态方法中直接访问
//        run();  // 报错
//        System.out.println(this); // this关键字表示当前对象
    }
    // 实例方法中即可直接调用实例方法，也可以直接访问实例成员
    // 实例方法中可以出现this关键字，静态方法中不能出现this关键字
    public void go(){
        System.out.println(count);
        printHelloWord2();
        System.out.println(name);
        run();
        System.out.println(this); // this关键字表示当前对象
    }
}
