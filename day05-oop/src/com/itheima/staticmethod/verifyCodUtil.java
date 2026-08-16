package com.itheima.staticmethod;
// 静态方法设计工具类
public class verifyCodUtil {
    // 工具类没有创建对象的必要性，所以建议私有化构造
    private verifyCodUtil(){

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
}
