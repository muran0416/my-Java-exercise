package com.itheima.extends6constructor;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String schoolName;
    public Student() {

    }

    public Student(String name, int age, char sex) {
        // this调用兄弟构造方法，必须放在第一行，不能和Super同时使用
        this(name,age,sex," Hogwarts");
    }

    public Student(String name, int age, char sex, String schoolName) {
        // super(); // 必须在第一行
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
