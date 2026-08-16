package com.itheima.staticmethod;

public class Student {
    private double score;
    //  静态方法：有static修饰，属于类，不需要创建对象，就可以直接调用
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // 实例方法：无static修饰，属于对象，需要创建对象，才能调用
    public void printPass(){
        System.out.println(score>=60?"通过":"未通过");
    }

    public void setScore(double score) {
        this.score = score;
    }

}
