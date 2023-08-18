package com.threadcase3;

import java.util.concurrent.Callable;

/**
 * Created with IDEA
 * author:D
 * Date:2023/8/18
 * Time:22:44
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //求1~100之和
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum = sum+i;
        }
        return sum;
    }
}
