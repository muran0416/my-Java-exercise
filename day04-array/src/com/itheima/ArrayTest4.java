package com.itheima;

/**
 * 斗地主牌组生成案例。
 * <p>
 * 通过数组保存 54 张扑克牌，先按花色和点数生成 52 张普通牌，
 * 再加入大小王，最后遍历打印整副新牌。
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        // 目标：完成斗地主游戏的做牌。
        startPoker();
    }

    /**
     * 生成一副斗地主扑克牌并打印。
     */
    public static void startPoker() {
        // 创建数组，用于存放 54 张牌。
        String[] poker = new String[54];

        // 定义 4 种花色和 13 个点数。
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 记录当前牌应该存入数组的下标。
        int index = 0;

        // 组合每一个点数和每一种花色，生成 52 张普通牌。
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index++] = colors[j] + numbers[i];
            }
        }

        // 添加大小王。
        poker[index++] = "小王";
        poker[index] = "大王";

        // 直接打印数组对象时，会输出数组的地址值。
        System.out.println(poker);
        System.out.println("新牌： ");

        // 遍历数组，打印每一张牌。
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }

        // 洗牌 。
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int) (Math.random() * poker.length);
            int index2 = (int) (Math.random() * poker.length);
            String temp = poker[index2];
            poker[index2] = poker[index1];
            poker[index1] = temp;
        }
        System.out.println("");
        System.out.println("洗牌后： ");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
    }
}
