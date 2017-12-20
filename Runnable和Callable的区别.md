#### 三.Runnable接口和Callable接口的区别？
> - Callable规定的方法是call()，Runnable规定的方法是run()。
> - Callable的任务执行后可以返回值，而Runnable的任务执行后是不能返回值的。
> - call()方法可以抛异常，而run()方法不可以。
> - 运行Callable任务可以拿到一个Future对象，表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。通过Future对象可以了解任务执行情况，可取消任务的执行，还可获取执行结果。
