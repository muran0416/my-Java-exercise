package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：理解关系运算符。
        print(10,20);
    }
    public static void print(int a,int b) {
        boolean result = a > b;
        System.out.println(result);

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }

}
