package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标：理解自增自减运算符
        print(10);
        printPositionDiff(10);
    }

    public static void print(int a) {
        a++; // a = a + 1;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    // 设计一个方法，理解自增自减放在变量前后的区别
    public static void printPositionDiff(int a) {
        // 前置：先加减，后使用（表达式的值是变化后的值）
        int b = ++a; // a 先 +1 变成 11，再把 11 赋给 b
        System.out.println("前置自增: a=" + a + ", b=" + b);

        // 后置：先使用，后加减（表达式的值是变化前的值）
        int c = a++; // 先把 a 的当前值 11 赋给 c，然后 a 再 +1 变成 12
        System.out.println("后置自增: a=" + a + ", c=" + c);

        // 前置自减
        int d = --a; // a 先 -1 变成 11，再把 11 赋给 d
        System.out.println("前置自减: a=" + a + ", d=" + d);

        // 后置自减
        int e = a--; // 先把 a 的当前值 11 赋给 e，然后 a 再 -1 变成 10
        System.out.println("后置自减: a=" + a + ", e=" + e);
    }
}