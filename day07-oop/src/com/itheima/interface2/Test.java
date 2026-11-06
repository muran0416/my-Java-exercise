package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        // Java设计接口的好处和用处.
        //弥补了类单继承不足,一个类同时可以实现多个接口,使类的角色更多,功能更强.
        People p = new Student();
        Driver d = new Student(); // 多态
        BoyFriend bf = new Student();

        // 让程序可以面向接口编程,这样程序员可以灵活方便的切换各种业务实现(便于程序的解耦合)
//        Driver a = new Teacher();
        Driver a = new Student();
        BoyFriend b = new Student();


    }
}

interface Driver{}
interface BoyFriend{}

class People{}
class Student extends People implements Driver, BoyFriend{}

class Teacher implements Driver,BoyFriend{}