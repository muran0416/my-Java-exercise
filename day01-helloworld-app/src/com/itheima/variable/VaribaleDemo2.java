package com.itheima.variable;

public class VaribaleDemo2 {
    public static void main(String[] args) {
       // 目标：掌握8种基本数据类型定义变量。
       printPrimitiveTypes();
    }

    // 打印8种基本数据类型的变量
    public static void printPrimitiveTypes() {
        // 1. 整数类型
        byte b = 127;
        // byte b1 = 128;  // 越界了
        short s = 32767;
        int i = 2147483647;
        /*注意：随便写一个整数字面量默认是int类型的，9223372036854775807这个数据虽然没有超过long的范围，
        但是超过了double的范围，所以报错。如果希望9223372036854775807是long类型，需要显示指定，加上L或者l*/
        long l = 9223372036854775807L;

        // 2. 浮点类型
        /*注意：随便写一个整数字面量默认是double类型的，如果希望3.14是float类型的，必须加上f或者F*/
        float f = 3.14f;
        double d = 3.141592653589793;

        // 3. 字符类型
        char c = 'A';

        // 4. 布尔类型
        boolean bool = true;
        boolean bool2 = false;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("boolean: " + bool2);

        // 5.字符串（引用数据类型）：定义字符串变量记住字符串数据的
        String str = "hello";
        System.out.println(str);
    }
}
