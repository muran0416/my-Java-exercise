package ccom.itheima.singleinstance;

public class Test {
    public static void main(String[] args) {
        // 设计单例类
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        // 指向同一个对象
        System.out.println(a1 == a2);
        System.out.println(a1);
        System.out.println(a2);

//        A.getInstance() = null; // 把A类的静态对象置为null，唯一对象消失
        System.out.println("================================");
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);
        System.out.println(b1);
        System.out.println(b2);
    }
}
