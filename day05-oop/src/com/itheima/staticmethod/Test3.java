package com.itheima.staticmethod;

public class Test3 {

    public static void main(String[] args) {
        //  目标：搞清楚静态方法的应用：可以做工具类。
        // 登陆界面
        String code = verifyCodUtil.getCode(4);
        System.out.println(code);

        System.out.println(Math.random());
    }

}
