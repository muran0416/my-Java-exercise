package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标：掌握逻辑运算符的使用。
        System.out.println(isMath(180,60,'女'));
        System.out.println(isMath(165,60,'女'));

        System.out.println(isMath2(170,50000));
        System.out.println(isMath2(190,50000));
        System.out.println(isMath2(170,500000));

        System.out.println(isMath3(false));

        isMath4();

        System.out.println("=====================================");

        print();

    }

    // & 必须前后条件都是true，结果才为true，只要有一个false，结果就是false
    public static boolean isMath(int height, int weight,char sex) {
        boolean result = height > 170 & weight >= 60 & weight <= 80 & sex == '女';
        return result;
    }
    // | 只要前后条件有一个为true,结果一定是true，必须都是false，结果才为false
    public static boolean isMath2(int height, int income) {
        boolean result = height >= 180 | income >= 100000;
        return result;
    }
    // ！ 取反
    public static boolean isMath3(boolean result) {
        return !result;
    }
    // ^ 异或,
    public static void isMath4() {
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
    }
    // 判断 && ｜｜ 与 & | 的区别
    public static void print(){
        int a = 111;
        int b = 2;
        // && 发现左边条件为false，右边条件不判断了
        System.out.println(a>1000 && ++b>1);
        System.out.println(b);
        // & 发现左边条件为false，右边条件照样判断
        System.out.println(a>1000 & ++b>1);
        System.out.println(b);

        int i = 10;
        int j = 20;
        // || 发现左边条件为true，右边条件不判断了
        System.out.println(i>5 || ++j>10); // true
        System.out.println(j);
        // | 发现左边条件为false，右边条件照样判断
        System.out.println(i>10 || ++j>10); // true
        System.out.println(j);
    }
}
