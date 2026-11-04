package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] arges){
        // 枚举类的应用场景：做信息的分类和标志
        // 1、常量做标志和分类：参数值不受约束
        move2(Constant.UP);
//        move(38);
        // 2、枚举做标志和分类：参数值受约束
        move1(Direction.DOWN);

    }
    public static void move1(Direction direction){
        // 根据方向做移动：上下左右
        switch (direction){
            // 可以省略前缀
            case UP:
                System.out.println("上");
                break;
            case Direction.DOWN:
                System.out.println("下");
                break;
            case Direction.LEFT:
                System.out.println("左");
                break;
            case Direction.RIGHT:
                System.out.println("右");
                break;
            default:
                System.out.println("错误");
        }
    }
    public static void move2(int direction){
        // 根据方向做移动：上下左右
        switch (direction){
            case Constant.UP:
                System.out.println("上");
                break;
            case Constant.DOWN:
                System.out.println("下");
                break;
            case Constant.LEFT:
                System.out.println("左");
                break;
            case Constant.RIGHT:
                System.out.println("右");
                break;
            default:
                System.out.println("错误");
        }
    }
}
