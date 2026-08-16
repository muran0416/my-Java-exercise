package com.itheima;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 动态初始化
        inputSocre();
    }
    public static void inputSocre() {
        double[] scores = new double[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的分数：");
            scores[i] = sc.nextDouble();
        }
        double allScore = scores[0];
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            double score = scores[i];
            allScore += score;
            if (maxScore < score) {
                maxScore = score;
            }
            if (minScore > score) {
                minScore = score;
            }
        }
        System.out.println("平均分是：" + allScore / scores.length);
        System.out.println("最高分是：" + maxScore);
        System.out.println("最低分是：" + minScore);
    }
}
