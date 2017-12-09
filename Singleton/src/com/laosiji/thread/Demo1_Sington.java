package com.laosiji.thread;

/**
 * @Author: Gosin
 * @Date: 2017/12/9
 */
public class Demo1_Sington {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2 == s2);
    }
}

/**
 * 饿汉式
 */
class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {};
    //2.创建本类对象
    private static Singleton s = new Singleton();
    //3.对外提供公共的访问方法
    public static Singleton getInstance() {//获取实例
        return s;
    }
}

/**
 * 懒汉式(单例的延迟加载模式)
 */
/*class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {};
    //2.声明引用
    private static Singleton s;
    //3.对外提供公共的访问方法
    public static Singleton getInstance() {//获取实例
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}*/


