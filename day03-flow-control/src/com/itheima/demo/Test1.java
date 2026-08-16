package com.itheima.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("请输入一个数字：");
        double b = sc.nextDouble();
        System.out.println("请输入+-*/：");
        String c = sc.next();
        double sum = 0;
        switch (c){
            case "+":
                sum =  a+b;
                break;
            case "-":
                sum =  a-b;
                break;
            case "*":
                sum =  a*b;
                break;
            case "/":
                sum =  a/b;
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        System.out.println(sum);
    }
}
