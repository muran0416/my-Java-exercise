package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100)+1;
        System.out.println(randomNum);
        test(randomNum);
    }
    public static void test(int f){
        Scanner sc = new Scanner(System.in);
        do {
            int number = sc.nextInt();
            if (number < f){
                System.out.println("你输入的太小了");
            } else if (number>f) {
                System.out.println("你输入的太大了");
            } else if (f==number) {
                System.out.println("恭喜你答对了"+f);
                break;
            }else{
                System.out.println("输入错误");
            }
        }while (true);
    }
}
