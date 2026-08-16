package com.itheima.branch;

public class IfTest2 {
    public static void main(String[] args) {
        ifTest();

    }
    public static void ifTest(){
        // 定义三个布尔变量，表示三种交通灯的状态
        boolean red = true;    // 红灯亮
        boolean yellow = false; // 黄灯灭
        boolean green = false;  // 绿灯灭

        // 使用多分支 if-else 判断当前哪个灯亮，并输出对应的提示
        if (red){
            System.out.println("红灯亮，停止");
        }else if (yellow){
            System.out.println("黄灯亮，准备");
        }else if (green){
            System.out.println("绿灯亮，开始");
        }else{
            // 如果红灯、黄灯、绿灯都不亮，则判定为灯故障
            System.out.println("灯故障，停止");
        }
    }
}
