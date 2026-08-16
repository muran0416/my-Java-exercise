package com.itheima.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        // 目标：认识if语句，搞清楚其写法和应用场景。（独立功能独立成方法）
        test1();

        test2();

        test3();

    }
    public static void test1() {
        int age = 10;
        if (age >= 18 ){
            System.out.println("可以上网");
        }
        System.out.println("洗洗睡吧");
        // 注意：if语句中如果只有1条语句，{}可以省略
    }
    public static void test2() {
        int money = 40;
        if(money >= 80){
            System.out.println("转账成功");
        }else {
            System.out.println("转账失败,余额不足");
        }
    }
    public static void test3() {
        System.out.println("请输入员工的分数：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("A+");
        }else if(score >= 80 && score < 90) {
            System.out.println("A");
        }else if (score >= 70 && score < 80){
            System.out.println("B");
        }else if (score >= 60 && score < 70){
            System.out.println("C");
        }else if (score >= 0 && score < 60){
            System.out.println("D");
        }else{
            System.out.println("输入的分数有误");
        }
    }
}
