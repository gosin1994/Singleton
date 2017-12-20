> 我自己整理的一些多线程面试题（2017.12.20）
### 线程相关问题（必问）

#### 一.创建线程的三种方式？
###### 1.通过继承Thread类创建线程
    1)首先定义一个类去继承Thread父类，重写父类的run()方法，在run()方法里面加入具体的任务代码或处理逻辑
    2)直接创建一个ThreadTest类对象，也可以利用多态性，变量声明为父类的类型。
    3)调用start()方法，线程启动，隐含的调用了run()方法
```
public class ThreadTest extends Thread() {

    @Override  
    public void run() {  
        for(int i=0;i<=10;i++){  
            System.out.println(i);  
        }     
    }  
    
    public static void main(String[] args) {
        ThreadTest thread1 = new ThreadTest();
        ThreadTest thread2 = new ThreadTest();
        thread1.start();
        thread2.start();
    }
}
```
###### 2.通过实现Runnable接口创建线程
    1)定义一个类去实现Runnable接口，重写接口中的run()方法。在run()方法中加入具体的任务代码或处理逻辑。
    2)创建Runnable接口实现类的对象。
    3)创建一个ThreadTest类的对象，需要封装前面Runnable接口实现类的对象。（接口可以实现多继承）
    4)调用Thread对象的start()方法，启动线程。
```
public class ThreadTest implements Runnable{  
      
    @Override  
    public void run() {  
        for(int i=0;i<=10;i++){  
            System.out.println(i);  
        }     
    }  
    public static void main(String[] args) {  
        ThreadTest threadTest=new ThreadTest();  
        Thread theard=new Thread(threadTest);  
        theard.start();  
    }  
}  

```
###### 3.通过Callable和Future创建线程
    1)创建Callable接口的实现类，并实现call()方法，该call()方法将作为线程执行体，并且有返回值。
    2)创建Callable实现类的实例，使用FutureTask类来包装Callable对象，该FutureTask对象封装了该Callable对象的call()方法的返回值。
    3)使用FutureTask对象作为Thread对象的target创建并启动新线程。
    4)调用FutureTask对象的get()方法来获得子线程执行结束后的返回值
```java
public class ThreadTest implements Callable<Integer>{  
  
    @Override  
    public Integer call() throws Exception {  
        int count =0;  
        for(int i=0;i<=10;i++){  
            count=count+i;  
        }  
        return count;     
    }  
    public static void main(String[] args) throws InterruptedException, ExecutionException {  
        ThreadTest test=new ThreadTest();  
        FutureTask<Integer> thread = new FutureTask<>(test);  
        new Thread(thread,"有返回值的线程").start();    
        System.out.println(thread.get());  
    }  
      
}  
```

#### 二.什么是线程安全？什么是线程不安全？
> 

#### 三.Runnable接口和Callable接口的区别？
#### 四.wait方法和sleep方法的区别？
#### 五.synchronized、Lock、ReentrantLock、ReadWriteLock？
#### 六.介绍下CAS(无锁技术)？
#### 七.什么是ThreadLocal？
#### 八.创建线程池的4种方式？
#### 九.ThreadPoolExecutor的内部工作原理？
#### 十.分布式环境下，怎么保证线程安全？
