package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 目标：理解表达式的自动类型提升
        int result = calc2((byte) 110,(byte) 120);
        System.out.println(result);

        int  result2 = calc2((byte) 111,(byte) 121);
        System.out.println(result2);

        int  result3 = calc3((byte) 111,(byte) 121);
        System.out.println(result3);
    }
    // 需求：接收各种类型的数据运算。
    public static double calc(int a, int b, double c, char d) {
        // 表达式的最终类型是由最高类型决定的。
        return a + b + c + d;
    }

    public static int calc2(byte a, byte b) {
        // byte short char运算时会直接提升成int运算。
        return a + b;
    }

    public static byte calc3(byte a, byte b) {
        byte c = (byte) (a + b);
        return c;
    }
}
