package com.itheima.loop;

public class ForTest3 {
    public static void main(String[] args) {
        test3();
    }
    public static void test2(){
        int sum = 0;
        for (int i = 1; i < 11; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void test3(){
        for (int i = 100; i < 1000; i++) {
            int g;
            int s;
            int b;
            g = i%10;
            s = i/10%10;
            b = i/100%10;
            if (g*g*g+s*s*s+b*b*b==i) {
                System.out.println(i);

            }
        }

    }
}
