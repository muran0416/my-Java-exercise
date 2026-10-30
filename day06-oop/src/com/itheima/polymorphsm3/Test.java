package com.itheima.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        // 右侧对象是解耦合的
//        Animal S1 = new Wolf();
        Animal S1 = new Tortoise();
        S1.run();
//        S1.pullHeadIn();  // 报错，多态下不能调用子类对象独有功能。

        // 强制类型转换，可以解决多态下调用子类对象独有功能的问题
        Tortoise t1 = (Tortoise) S1;
        t1.pullHeadIn();

        // 有继承关系就可以强制类型转换，编译阶段不会报错
        // 运行时会出现类型转换异常：ClassCastException
//        Wolf w1 = (Wolf) S1;

        System.out.println("=========================");


//        Wolf w = new Wolf();
//        go(w);

        Tortoise t = new Tortoise();
        go(t);


    }
    // 父类类型的变量作为参数，可以接收一切子类的对象
    public static void go(Animal a){
        System.out.println("开始。。。。");
        a.run();
        // a.eatsheep(); // 报错，多态下不能调用子类对象独有功能。
        // java建议强制转换前，应该先判断对象的真实类型，再进行强制类型转换
        if(a instanceof Wolf){
            Wolf w1 = (Wolf) a;
            w1.eatsheep();
        } else if (a instanceof Tortoise) {
            Tortoise t1 = (Tortoise) a;
            t1.pullHeadIn();
        }
    }
}
