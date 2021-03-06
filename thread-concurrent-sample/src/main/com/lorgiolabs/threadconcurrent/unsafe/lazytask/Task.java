package com.lorgiolabs.threadconcurrent.unsafe.lazytask;

/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class Task implements Runnable {

    private LazyInit lazyInit;

    public Task(LazyInit lazyInit) {
        this.lazyInit = lazyInit;
    }

    @Override
    public void run() {
        Object object = lazyInit.getInstance();
        System.out.println("Got: " + object);
    }
}
