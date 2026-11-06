package com.itheima.interface1;

public class Test {
    public static void main(String[] args) {
        // 接口
        System.out.println(A.NUM);
        // 注意：接口不能被实例化
        // 接口是用来被类实现的
        C c = new C();
        c.run();
        System.out.println(c.go());
        c.Play();

    }
}
// C被称为实现类。同时实现多个接口
// 实现类实现多个接口，必须重写全部接口的全部抽象方法，否则这个类必须定义为抽象类
class C implements A,B{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public String go() {
        return "gogogo";
    }

    @Override
    public void Play() {
        System.out.println("Play");
    }
}