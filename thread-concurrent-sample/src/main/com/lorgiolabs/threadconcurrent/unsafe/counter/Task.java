package com.lorgiolabs.threadconcurrent.unsafe.counter;

/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class Task implements Runnable {

    private UnsafeCounter counter;
    private int times;

    public Task(UnsafeCounter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for(int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}
