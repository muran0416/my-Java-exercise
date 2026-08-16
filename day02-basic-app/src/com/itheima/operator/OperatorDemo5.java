package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目标：三元运算符。
        print(10, 20);
        print(59);
        getMax(10, 20, 30);
        getMax2(10, 40, 30);
    }
    public static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println(max);
    }
    // 需求：判断成绩是否通过或者挂科
    public static void print(int score) {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }
    // 需求：求三个整数的最大值
    public static void getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        int max2 = max > c ? max : c;
        System.out.println(max2);
    }
    public static void getMax2(int a, int b, int c) {
        // 三元运算符嵌套
        int max = a > b ? (a > c ? a : c ): (b > c ? b : c);
        System.out.println(max);
    }
}
