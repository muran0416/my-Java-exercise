package com.itheima.loop;

public class ForTest2 {
    public static void main(String[] args) {
        System.out.println(test1());
    }
    public  static int test1()
    {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
        }
        return sum;
    }

}
