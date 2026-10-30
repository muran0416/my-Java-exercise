package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 生成 getter 和 setter 方法，以及 toString 方法，需要安装 lombok 插件
@Data // @Data注解可以自动生成 getter 和 setter 方法，以及 toString 方法，无参构造器
@NoArgsConstructor // @NoArgsConstructor 注解可以自动生成无参构造器
@AllArgsConstructor // @AllArgsConstructor 注解可以自动生成全参构造器
public class Card {
    private String carId;
    private String name;
    private String phone;
    private double money;

    // 预存金额
    public void deposit(double money) {
        this.money += money;
    }

    // 消费金额
    public void consume(double money) {
        this.money -= money;
    }

}
