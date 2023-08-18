package com.threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:43
 */
public class callableCase {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 第三种方式：可以获取执行结果
         *
         *  1创建类实现callable接口
         *  2重写call
         *  3创建MyCallable对象（表示多线程要执行的任务）*
         *  4创建FutureTask对象（管理多线程运行结果）*
         *  5创建thread类的对象，启动*
         */
        //多线程要执行的任务
        MyCallable mc = new MyCallable();

        //管理多线程运行结果
        FutureTask<Integer> ft = new FutureTask<>(mc);

        //创建线程
        Thread t1 = new Thread(ft);

        t1.start();

        //获取运行结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
