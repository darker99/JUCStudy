package com.Threadcase1;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:02
 */
public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 多线程第一种启动方式：
         * 1自己定义类继承thread
         * 2重写run方法
         * 3创建子类对象 启动线程
         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
