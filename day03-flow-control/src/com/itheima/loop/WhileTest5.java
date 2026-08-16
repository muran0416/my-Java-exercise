package com.itheima.loop;

public class WhileTest5 {
    public static void main(String[] args) {
        System.out.println(calc(100000));
        System.out.println(test());
    }
    public static int calc(double num){
        double rate = 0.017;
        int year = 0;
        double money = num;

        while(money<num*2){
            year++;
            money=money*(1+rate);
        }
        return year;
    }
    public static int test(){
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int sum=0;
        while (paperThickness<peakHeight){
            sum++;
            paperThickness = paperThickness*2;
        }
        return sum;
    }
}
