package com.itheima.polymorphsm3;

public class Tortoise extends Animal {
    String name = "乌龟";
    @Override
    public void run() {
        System.out.println("乌龟在爬");
    }
    public void pullHeadIn() {
        System.out.println("乌龟缩头");
    }
}
