package com.itheima.abstract3;

public class Test {
    public static void main(String[] args) {
        People s = new Student();
        s.write();
        System.out.println("------------");
        People t = new Teacher();
        t.write();
    }
}
