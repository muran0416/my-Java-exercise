package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //  1、设计电影类Movie，以便创建电影对象，封装电影数据。
        //  2、封装电影中的全部数据。（自己造一些数据）
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "《肖申克的救赎》", 9.5, "蒂姆·罗宾斯");
        movies[1] = new Movie(2, "《霸王别姬》", 9.4, "张国荣");
        movies[2] = new Movie(3, "《阿甘正传》", 9.3, "汤姆·汉克斯");
        movies[3] = new Movie(4, "《教父》", 9.2, "马龙·白兰度");
        movies[4] = new Movie(5, "《辛德勒的名单》", 9.1, "拉塞尔·克劳");
        movies[5] = new Movie(6, "《乱世佳人》", 9.0, "梅格·瑞恩");

        // 3、创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies(); // ALT+ ENTER
        mo.searchMovieById();
    }
}
