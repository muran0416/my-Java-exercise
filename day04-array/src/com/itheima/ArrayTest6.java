package com.itheima;

public class ArrayTest6 {
    public static void main(String[] args) {
        start(4);
    }
    public static void start(int n) {
        int[][] arr = new int[n][n];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++num;
            }
        }
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int m = (int)(Math.random()*arr.length);
                int p = (int)(Math.random()*arr.length);
                int temp = arr[m][p];
                arr[m][p] = arr[i][j];
                arr[i][j] = temp;

            }
        }
        System.out.println("===================================");

        printArray(arr);

    }
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
