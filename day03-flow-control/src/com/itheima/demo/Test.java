package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200 ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
