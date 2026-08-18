package com.itheima.extends5override;

public class Test2 {
    static void main(String[] args) {
        // 方法重写的常见应用场景:子类重写Object类的toString方法,以便返回对象的内容
        Student s = new Student("赵敏", 21, '女');
        System.out.println(s);
        // 直接输出对象默认调用toString方法,可以省略不写,返回的是地址信息
        // 输出对象的地址信息实际上没有意义,开发中更希望输出对象的内容信息,因此需要重写toString方法

    }
}
class Student extends Object{
    private String name;
    private int age;
    private char sex;

    public Student(){

    }

    public Student(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}