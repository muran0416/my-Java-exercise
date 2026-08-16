package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：认识方法重载
        print(100);
        print(3.14);
        print("HelloWorld");

        System.out.println("------------------------");

        // 演示发射导弹的方法重载
        fire();
        fire(3);
        fire("敌方基地");
        fire("敌方基地", 5);
    }
    // 定义一个方法，打印一个整数
    public static void print(int a){
        System.out.println("整数：" + a);
    }

    // 定义一个重载的方法，打印一个小数
    public static void print(double a){
        System.out.println("小数：" + a);
    }

    // 定义一个重载的方法，打印一个字符串
    public static void print(String s){
        System.out.println("字符串：" + s);
    }

    public static void print(int a,double b){
        System.out.println(b);
    }

    // 重复的方法冲突了！
//    public static void print(int a1,double b1){
//        System.out.println(b1);
//    }

    // 注意：方法重载只关心方法名称相同，型参列表不同（类型不同，个数不同，顺序不同），其他都无所谓

    // 需求：发射导弹
    // 无参：发射 1 枚默认导弹
    public static void fire(){
        System.out.println("发射 1 枚导弹");
    }

    // 重载：按指定数量发射
    public static void fire(int count){
        System.out.println("发射 " + count + " 枚导弹");
    }

    // 重载：向指定目标发射 1 枚导弹
    public static void fire(String target){
        System.out.println("向 " + target + " 发射 1 枚导弹");
    }

    // 重载：向指定目标发射指定数量导弹
    public static void fire(String target, int count){
        System.out.println("向 " + target + " 发射 " + count + " 枚导弹");
    }

}
