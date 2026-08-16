package com.itheima.hello;

/**
 * HelloWorld 示例程序，用于在控制台输出 "Hello World!"。
 */
public class HelloWorld {
    /**
     * 程序的主入口方法。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 在控制台打印 Hello World!
        System.out.println("Hello World!");
        System.out.println("-------------------->");
        // 调用 printHelloWorld 方法，打印3行 Hello World!
        printHelloWorld();

        System.out.println("-------------------->");
        System.out.println("3 + 5 = " + add(3, 5)); // 调用 add 方法，计算3+5的和，输出结果

    }

    // 打印3行Hello World!
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    // 我要求任意两个整数的和
    public static int add(int a, int b) {
        return a + b;
    }
}
