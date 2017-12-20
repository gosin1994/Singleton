#### 十一. ThreadLocal和同步机制?

 > *[ThreadLocal和同步机制，两者面向的问题领域不同](http://hubingforever.blog.163.com/blog/static/17104057920109133152446/)*
 
&emsp;&emsp;同步机制是为了同步多个线程对相同资源的并发访问，是为了多个线程之间进行通信的有效方式；    而ThreadLocal是隔离多个线程的数据共享，从根本上就不在多个线程之间共享资源（变量），这样当然不需要对多个线程进行同步了。

&emsp; &emsp;所以，如果你需要进行多个线程之间进行通信，则使用同步机制；如果需要隔离多个线程之间的共享冲突，可以使用ThreadLocal，这将极大地简化你的程序，使程序更加易读、简洁。

&emsp;&emsp;如果我们想把ThreadLocal所绑定的对象的引用清空，请不要粗暴的把ThreadLocal引用设置null,而应该调用remove()方法。否则会造成内存泄露。
