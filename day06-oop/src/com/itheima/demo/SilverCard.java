package com.itheima.demo;

public class SilverCard extends Card{
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前银卡消费：" + money);
        System.out.println("优惠后的价格：" + (money * 0.9));
        if(getMoney() < (money * 0.8)){
            System.out.println("余额不足，请充值，当前余额为：" + getMoney());
            return;
        }
        setMoney(getMoney() - (money * 0.9));
        System.out.println("您当前余额为：" + getMoney());
    }
}
