package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 目标：掌握扩展的赋值运算符。
        receive(5);

    }
    public static void receive(int b) {
        int a = 100;
        a += b; // 等价于 a = (a的类型)(a+b)；
        System.out.println("收红包后，的金额是" + a);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2; // 等价于 a1 = (byte)(a1 + a2)；扩展赋值运算符自带强制转换。
        System.out.println(a1);

        int c = 100;
        c -= b; // 等价于 c = c - b;
        System.out.println("减去后，金额是" + c);

        int d = 100;
        d *= b; // 等价于 d = d * b;
        System.out.println("乘以后，金额是" + d);

        int e = 100;
        e /= b; // 等价于 e = e / b;
        System.out.println("除以后，金额是" + e);

        int f = 100;
        f %= b; // 等价于 f = f % b;
        System.out.println("取余后，金额是" + f);
    }
}
