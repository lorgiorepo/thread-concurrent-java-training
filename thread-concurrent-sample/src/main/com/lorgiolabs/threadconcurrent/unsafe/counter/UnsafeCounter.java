package com.lorgiolabs.threadconcurrent.unsafe.counter;

/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class UnsafeCounter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
