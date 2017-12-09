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
      public static getInstance() {
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
      public static getInstance() {
        if(s == null) {
          s = new Singleton();
          return s;
        }
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