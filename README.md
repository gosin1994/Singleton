# Singleton
 #### 单例设计模式(保证类在内存中只有一个对象)
 ###### 饿汉式

``` java
    可以理解为：比较饥饿，一上来就new对象。
    class Singleton{
      //1.私有构造方法，其他类不能访问该构造方法
      private Singleton() {};
      //2.创建本类对象
      private static Singleton s = new Singleton();
      //3.对外提供公共的访问方法
      public static Singleton getInstance() {
        return s;
      }
    }
```

 ###### 懒汉式(又叫：单例的延迟加载模式)
 ``` java
     可以理解为：比较懒，上来先不去new对象，而是做一个判断，当你需要的时候再去new对象
      class Singleton{
          //1.私有构造方法，其他类不能访问该构造方法
          private Singleton() {};
          //2.声明引用
          private static Singleton s;
          //3.对外提供公共的访问方法
          public static Singleton getInstance() {
              if(s == null) {
                  s = new Singleton();
              }
              return s;
          }
      }

 ```

######第三种单例模式
``` java
 class Singleton{
      //1.私有构造方法，其他类不能访问该构造方法
      private Singleton() {};
      //2.创建本类对象
      private static final Singleton s = new Singleton();
      }
    }
```
######饿汉式和懒汉式的区别
``` java
1. 懒汉式是空间换时间（一上来就new对象，占用了空间；想用时随时调用，节约了时间）
   饿汉式是时间换空间（每一次都要判断是否==null，所以浪费了时间节约了空间）
2. 在多线程访问时，饿汉式不会创建多个对象，而懒汉式有可能创建多个对象
```