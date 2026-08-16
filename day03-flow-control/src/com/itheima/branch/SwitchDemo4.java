package com.itheima.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        test1();
    }
    // 穿透性的作用：可以通过穿透性合并，减少代码的重复性
    public static void test1(){
        String week = "周二";
        switch (week){
            case "周一":
                System.out.println("埋头苦干，解决Bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("埋头苦干，解决Bug");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("错误");
        }
    }
}
