package com.itheima;

public class ArrayDemo1 {
    public static void main(String[] args) {
        randomCall();

    }

    // 我是一名Java初学者，请帮我开发一个随机点名的方法，假设有15名学生。
    public static void randomCall(){
        String[] names = new String[]{
                "张三", "李四", "王五", "赵六", "钱七",
                "孙八", "周九", "吴十", "郑十一", "王十二",
                "冯十三", "陈十四", "褚十五", "卫十六", "蒋十七"
        };
        // Math.random() 生成一个0-1之间的随机小数，乘以names.length得到一个0-14之间的随机小数，强制转换为int类型得到一个0-14之间的随机整数
        int index = (int)(Math.random() * names.length);
        System.out.println("被点到的学生是：" + names[index]);
    }

}
