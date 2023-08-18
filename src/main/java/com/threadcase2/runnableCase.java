package com.threadcase2;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:20
 */
public class runnableCase {

    /**第二种启动方式
     * 1实现runnable接口
     * 2重写run方法
     * 3创建类对象
     * 4创建Thread对象 开启线程
     */
    public static void main(String[] args) {

        //创建run对象
        //表示多线程要执行的任务
        MyRun myRun = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

        /**
         * 由于创建了两个线程 cpu对线程是交替执行的 所以会出现线程交替 但是每个线程还是有本地栈的 会存储i的值 所以不会计算出错*
         */

    }
}
