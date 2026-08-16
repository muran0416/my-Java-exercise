package com.itheima.capsulation;

public class Student {
    String name;
    // 如何隐藏：使用private（私有，隐藏）关键字修饰成员变量，只能在本类中被访问，其他任何地方访不能直接访问
    private int age;
    private double chinese;
    private double math;

    // 如何访问：提供getter和setter方法
    public void setAge(int age){
        if (age>0 && age<=120){
            this.age = age;
        }else {
            System.out.println("年龄输入有误");
        }
    }

    public int getAge(){
        return age;
    }

    public void printAllScore(){
        System.out.println(name+"总成绩是："+(chinese+math)+"平均成绩是："+((chinese+math)/2));
    }
}
