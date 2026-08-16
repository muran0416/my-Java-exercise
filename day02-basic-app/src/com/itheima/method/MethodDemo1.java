package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用。
        int sum = getSum(10,20);
        System.out.println("和是：" + sum);

        System.out.println("------------------------");

        int sum1 = getSum(100,200);
        System.out.println("和是：" + sum1);

        System.out.println("------------------------");

        printHelloWorld3Times();

        System.out.println("------------------------");

        String code = getCode(4);
        System.out.println("验证码：" + code);
        System.out.println(getCode(5));
    }
    // 定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a,int b){
        return a+b;
    }

    // 需求：打印3行HelloWorld，不需要参数，也不返回值
    // 注意：如果方法没有返回结果，返回类型必须声明成void。
    // 无参，无返回值
    public static void printHelloWorld3Times(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    // 需求3: 获取一个指定位数的验证码返回。
    // 掌握方法的定义格式
    // 需要接收数据吗？ 需要，需要接收位数。 int leg
    // 需要返回数据吗？ 需要，返回验证码。 String
    // 有参数，有返回值
    public static String getCode(int len){
        String code = "";
        for (int i = 0; i < len; i++) {
            int num = (int)(Math.random() * 10); // 0 ~ 9 的随机整数
            code += num;
        }
        return code;
    }

}
