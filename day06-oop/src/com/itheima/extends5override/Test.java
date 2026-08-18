package com.itheima.extends5override;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal{
    // 方法重写：方法名称相同，参数列表相同，返回类型相同或子类型，异常相同或子类型
    // 重写的规范:声明不变,重新实现
    @Override // 重写的校验注解(标志):要求方法名称和形参列表必须与重写方法一致,否则报错
    //更安全,可读性更强
    public void cry() {
        System.out.println("猫叫");
    }

}

class Animal{
    public void cry(){
        System.out.println("动物叫");
    }
}
