package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("湘A9978B", "张三", "18376429610", 5000);
        pay(goldCard);
        SilverCard silverCard = new SilverCard("湘B977CR", "李斯", "15076785949", 2000);
        pay(silverCard);
    }
    public static void pay(Card card){
        System.out.println("请刷卡，请您输入当前消防的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);
    }
}
