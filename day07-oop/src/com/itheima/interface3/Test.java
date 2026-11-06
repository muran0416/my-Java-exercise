package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 80.0);
        allStudents[1] = new Student("李四", '女', 90.0);
        allStudents[2] = new Student("王五", '男', 75.0);
        allStudents[3] = new Student("赵六", '女', 60.0);
        allStudents[4] = new Student("孙七", '男', 50.0);
        allStudents[5] = new Student("周八", '女', 70.0);
        allStudents[6] = new Student("吴九", '男', 85.0);
        allStudents[7] = new Student("郑十", '女', 95.0);
        allStudents[8] = new Student("王十一", '男', 88.0);
        allStudents[9] = new Student("赵十二", '女', 92.0);

        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
