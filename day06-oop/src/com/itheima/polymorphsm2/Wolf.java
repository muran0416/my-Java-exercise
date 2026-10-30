package com.itheima.polymorphsm2;

public class Wolf extends Animal {
    String name = "狼";
    @Override
    public void run() {
        System.out.println("狼在跑");
    }
    public void eatsheep(){
        System.out.println("狼吃羊");
    }

}
