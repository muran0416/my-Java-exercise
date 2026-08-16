package com.itheima.branch;

import java.util.Scanner;

public class SwitchDem03 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        switch (sex){
            case "男":
                System.out.println("男士");
                break;
            case "女":
                System.out.println("女生");
                break;
            default:
                System.out.println("性别错误");
        }
    }
}
