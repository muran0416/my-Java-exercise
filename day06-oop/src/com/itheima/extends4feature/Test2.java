package com.itheima.extends4feature;

public class Test2 {
    public static void main(String[] args) {
        // 继承后子类的访问特点:就近原则
        Zi zi = new Zi();
        zi.show();
    }
}
class Fu{
    String name = "Fu的name";
    public void run(){
        System.out.println("fu的run方法");
    }

}
class Zi extends Fu{
    String name = "Zi的name";

    public void show(){
        String name = "show的name";
        System.out.println(name); // show的name
        System.out.println(this.name); // Zi的name
        System.out.println(super.name); // Fu的name
        run(); // zi的run方法
        super.run(); // fu的run方法
    }
    public void run(){
        System.out.println("zi的run方法");
    }

}