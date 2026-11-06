package com.itheima.interface5;

public class Test {
    static void main(String[] args) {
        C2 c2 = new C2();
        c2.show();
        c2.go();
    }
}
// 4、一个类实现了多个接口，如果接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
interface A3{
    default void show(){
        System.out.println("A3接口中的默认方法show()");
    }
}
interface B3{
    default void show(){
        System.out.println("B3接口中的默认方法show()");
    }
}

class C3 implements A3, B3{
    @Override
    public void show() {
        A3.super.show();
        B3.super.show();
    }
}


// 3、一个类集成了父类，又同时实现类接口，如果父类中和接口中有同名的方法，实现类会优先用父类的。
interface A2{
    default void show(){
        System.out.println("A2接口中的默认方法show()");
    }
}
class B2 {
    public void show() {
        System.out.println("父类中的方法show()");
    }
}
// 继承在前实现在后
class C2 extends B2 implements A2{
    public void go(){
        show(); // 调用的是父类中的方法
        A2.super.show(); // 调用的是接口中的方法
    }
}


// 2、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则接口不能继承多个接口，也不能支持多实现。[了解]
interface A1{
    void show();
}
interface B1{
//    String show();
    void show();
}
interface C1 extends A1, B1{
    void show();
}
class D1 implements A1,B1{
    @Override
    public void show() {

    }
}


// 1、接口与接口可以多继承：一个接口可以继承多个接口。[重点]
// 类与类：单继承：一个类可以继承一个父类。
// 类与接口：多实现，一个类可以实现多个接口。
// 接口与接口：多继承：一个接口可以继承多个接口。
interface A {
    void show1();
}
interface B {
    void show2();
}
interface C extends A, B {
    void show3();
}
class D implements C {
    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }

    @Override
    public void show3() {

    }
}


