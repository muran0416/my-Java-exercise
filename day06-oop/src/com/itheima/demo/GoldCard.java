package com.itheima.demo;

public class GoldCard extends Card{
    public GoldCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前金卡消费：" + money);
        System.out.println("优惠后的价格：" + (money * 0.8));
        if(getMoney() < (money * 0.8)){
            System.out.println("余额不足，请充值，当前余额为：" + getMoney());
            return;
        }
        setMoney(getMoney() - (money * 0.8));
        if (money * 0.8 >= 200) {
            printTicket();
        }else {
            System.out.println("消费金额不足200元，不打印洗车票");
        }
        System.out.println("您当前余额为：" + getMoney());

    }
    // 打印洗车票
    public void printTicket() {
        System.out.println("洗车票");
    }
}
