package com.itheima.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        // 右侧对象是解耦合的
//        Animal S1 = new Wolf();
        Animal S1 = new Tortoise();
        S1.run();
//        S1.pullHeadIn();  // 报错，多态下不能调用子类对象独有功能。


        Wolf w = new Wolf();
        go(w);

        Tortoise t = new Tortoise();
        go(t);


    }
    // 父类类型的变量作为参数，可以接收一切子类的对象
    public static void go(Animal a){
        System.out.println("开始。。。。");
        a.run();
    }
}
