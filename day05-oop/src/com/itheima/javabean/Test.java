package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("波妞");
        s.setChinese(80);
        s.setMath(90);
        System.out.println(s.getName());
        System.out.println(s.getChinese());
        System.out.println(s.getMath());

        Student s2 = new Student("小王", 80, 90);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());


        //在开发中的运用场景
        StudentOperator operator = new StudentOperator(s);
        operator.printTotalScore();
        operator.printAvgScore();
    }
}
