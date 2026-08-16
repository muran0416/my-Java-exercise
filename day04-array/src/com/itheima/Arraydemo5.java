package com.itheima;

public class Arraydemo5 {
    public static void main(String[] args) {
        // 二维数组
        printArray();
    }
    public static void printArray() {
        String[][] classroom = {
                {"小王", "小李", "小张"},
                {"小赵", "小钱", "小孙"},
                {"小周", "小吴", "小郑"},
        };
        for (int i = 0; i <classroom.length; i++) {
            for (int j = 0; j <classroom[i].length; j++) {
                System.out.print(classroom[i][j]+"\t");
            }
            System.out.println();


        }
    }

}
