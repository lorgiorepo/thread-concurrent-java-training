package com.lorgiolabs.threadconcurrent.secondsample;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class Task implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
