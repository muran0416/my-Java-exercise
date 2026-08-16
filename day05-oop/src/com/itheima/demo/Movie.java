package com.itheima.demo;

public class Movie {
    private int id; // 编号
    private String name; // 名称
    private double price; // 价格
    private String actor; // 演员

    // 定义一个无参构造器
    public Movie() {
    }

    // 定义一个有参构造器
    public Movie(int id, String name, double price, String actor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
