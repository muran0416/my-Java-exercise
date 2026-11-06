package com.itheima.interface3;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] students; // Array of students
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos(){
        System.out.println("全部学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("全班平均分是：" + sum / students.length);
    }
}
