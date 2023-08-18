package com.threadcase2;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:20
 */
public class MyRun implements  Runnable{

    //线程要执行的代码
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"调用了run方法");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"helloWord"+i);
        }
    }
}
