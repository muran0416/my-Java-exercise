package com.itheima.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 目标：完成健康计算器。
        Scanner sc = new Scanner(System.in); // 创建Scanner对象
        // 1、让用户输入自己的个人信息：身高、体重、性别、年龄
        System.out.println("请输入身高："); // 提示用户输入身高
        double height = sc.nextDouble();

        System.out.println("请输入体重：");
        double weight = sc.nextDouble();

        System.out.println("请输入性别：");
        String sex = sc.next();

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        double bmi = calculateBMI(height,weight);
        System.out.println("BMI指数为：" + bmi);

        double bmr = calculateBMR(height,weight,age,sex);
        System.out.println("BMR指数为：" + bmr);



    }
    // 2、根据个人信息，计算BMI指数（BMI = 体重 / 身高 * 身高 把数据交个一个独立方法来计算并返回这个结果）
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    // 3、根据个人信息，计算BMR（BMR = 25 * 体重 / 身高 * 身高 把数据交个一个独立方法来计算并返回这个结果）
    public static double calculateBMR(double height, double weight,int age, String sex) {
        double bmr = 0;
        if (sex.equals("男")) {
            bmr = 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age;
        } else {
            bmr = 447.593 + 9.247 * weight + 3.099 * height - 4.33 * age;
        }
        return bmr;
    }
}
