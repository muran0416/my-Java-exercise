package com.itheima.Test;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 91;
        s1.math = 90;

        Student s2 = new Student();
        s2.name = "波崽";
        s2.chinese = 80;
        s2.math = 95;

        s1.printAllScore();
        s2.printAllScore();
    }
}
