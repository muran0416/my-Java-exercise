package ccom.itheima.singleinstance;
// 饿汉式单例模式
public class A {
    // 2、创建一个静态对象，用于保存创建的唯一对象
//    public static final A a = new A();
    private static A a = new A();

    // 1、私有化构造器:确保单例类不能被创建太多对象，只能创建一个对象
    private A() {
    }

    // 3、提供一个公共的静态方法，用于返回唯一对象
    public static A getInstance() {
        return a;
    }
}
