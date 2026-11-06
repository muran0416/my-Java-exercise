package com.itheima.interface4;

public class Test {
    static void main(String[] args) {
        // 接口新增的三种方法
        A a = new AImpl();
        a.go();
        A.show();
    }
}
class AImpl implements A{

}