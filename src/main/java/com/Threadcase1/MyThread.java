package com.Threadcase1;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:08
 */
public class MyThread  extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"helloWord!");
        }
    }
}
