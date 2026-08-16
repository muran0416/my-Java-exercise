package com.itheima;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {15, 9000, 10000, 20000, 9500,  -5};
        int max = getMax(scores);
        System.out.println("最大值是："+ max);
    }
    // 返回最大值
    public static int getMax(int[] arr) {
       int max = arr[0];
       for (int i = 0; i < arr.length; i++) {
           int data = arr[i];
           if (max < arr[i]) {
               max = data;
           }
       }
        return max;
    }


}
