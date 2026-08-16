package com.itheima.literal;

public class LiteralDemo {
    static void main() {
        printLiteral();
    }
    public static void printLiteral(){
        // 请帮我直接输出常见的字面量
        // 1、整数字面量，直接写
        System.out.println(1);
        // 2、浮点数字面量，直接写（小数）
        System.out.println(1.0);
        // 3、布尔型字面量，只有true和false
        System.out.println(true);
        System.out.println(false);

        // 4、字符型字面量，用单引号括起来，里面只能有一个字符
        System.out.println('a');
        System.out.println('字');
        // System.out.println('文字'); // 报错
        System.out.println(' ');
        //System.out.println(''); // 报错

        // 5、字符串字面量，用双引号括起来，里面可以有任意字符
        System.out.println("Hello World!");
        System.out.println("");
        System.out.println("  aaa");
        System.out.println("你好aaa");

        // 掌握一些特殊的字符：\n（换行）、\t（制表符）
        System.out.println("Hello\nWorld!");
        System.out.println("Hello\tWorld!");
    }

}
