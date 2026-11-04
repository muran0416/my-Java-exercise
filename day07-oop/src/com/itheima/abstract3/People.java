package com.itheima.abstract3;

public abstract class People {
    // 模板方法
    // 模板方法，定义了写代码的共同步骤
    // 模板方法，定义了写代码的步骤，final表示不能被重写
    public final void write() {
        System.out.println("写代码");
        writeMian();
        System.out.println("提交代码");
    }
    // 抽象方法，定义了写代码的步骤，具体实现由子类完成
    public abstract void writeMian();
}