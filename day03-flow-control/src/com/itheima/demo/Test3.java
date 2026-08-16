package com.itheima.demo;

public class Test3 {
    public static void main(String[] args) {
        String code = getCode(4);
        System.out.println(code);
        test1();

    }
    public static String getCode(int n){
        String code = "";
        for (int i = 1; i <= n; i++) {
            int type = (int)(Math.random()*3);
            switch (type) {
                case 0:
                    int num = (int)(Math.random ()*10);
                    code += num;
                    break;
                case 1:
                    int num1 = (int)(Math.random()*26);
                    char ch = (char)('A'+num1);
                    code += ch;
                    break;
                case 2:
                    int num2 = (int)(Math.random()*26);
                    char ch2 = (char)('a'+num2);
                    code += ch2;
                    break;
                default:
                    break;
            }
        }

        return code;
    }
    public static void test1(){
        String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char c=chars.charAt((int)(Math.random()*chars.length()));
        System.out.println(c);
    }
}
