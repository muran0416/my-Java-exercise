package com.itheima.javabean;

public class StudentOperator {
    // 拿到要处理的学生对象
    private Student s;
    public StudentOperator(Student s){
        this.s = s;
    }
    public void printTotalScore(){
        System.out.println(s.getName() + "的总分是：" + (s.getChinese() + s.getMath()));

    }
    public void printAvgScore(){
        System.out.println(s.getName() + "的平均分是：" + (s.getChinese() + s.getMath()) / 2);

    }
}
