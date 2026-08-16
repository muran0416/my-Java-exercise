package com.itheima.loop;

public class DoWhileDemo6 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        int i = 0;
        do {
            System.out.println("i="+i );
            i++;
        }while (i < 3);
    }
}
