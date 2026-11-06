package com.itheima.interface3;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] students; // Array of students
    public ClassDataInterImpl2 (Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全部学生信息如下：");
        int maleCount = 0;
        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if(s.getSex() == '男'){
                maleCount++;
            }
        }
        System.out.println("男生成人数是：" + maleCount);
        System.out.println("女生成人数是：" + (students.length - maleCount));
    }

    @Override
    public void printAverageScore() {
        System.out.println("全班平均分如下：");
        Student s1 = students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("最高分是：" + max + "，最低分是：" + min);
        double averageScore = (sum - max - min) / (students.length - 2);
        System.out.println("全班平均分是：" + averageScore);
    }
}
