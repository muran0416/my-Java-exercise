package com.itheima.staticmethod;

public class Test2 {
    public static void main(String[] args) {
        //  目标：搞清楚静态方法的应用：可以做工具类。
        // 注册界面
        String code = verifyCodUtil.getCode(4);
        System.out.println(code);
    }
}
