package com.laosiji.test;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2 == s2);
    }
}

class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {};
    //2.创建本类对象
    private static Singleton s = new Singleton();
    //3.对外提供公共的访问方法
    public static Singleton getInstance() {//获取实例
        retrun s;
    }
}
