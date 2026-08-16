package com.itheima.Test;

public class Student {
    String name;
    double chinese;
    double math;

    public void printAllScore(){
        System.out.println(name+"总成绩是："+(chinese+math)+"平均成绩是："+((chinese+math)/2));
    }
}
