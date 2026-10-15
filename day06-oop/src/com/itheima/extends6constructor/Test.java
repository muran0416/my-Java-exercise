package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：认识子类构造器的特点，再看应用场景。
        // 子类先调用父类构造器，再执行自己的构造器。
        Zi z = new Zi();
    }

}
class Zi extends Fu{
    public Zi(){
        super(666); // 指定调用父类的有参构造器。
        System.out.println("子类无参构造器执行了");
    }
}
class Fu{
    private Fu(){
        System.out.println("父类无参构造器执行了");
    }
    public Fu(int a){
        System.out.println("父类有参构造器执行了");
    }
}
