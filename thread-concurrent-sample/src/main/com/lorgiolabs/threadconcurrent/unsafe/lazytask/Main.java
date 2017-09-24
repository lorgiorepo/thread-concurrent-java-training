package com.lorgiolabs.threadconcurrent.unsafe.lazytask;


/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class Main {

    public static void main(String[] args) {
        LazyInit lazyInit = new LazyInit();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Task(lazyInit));
            threads[i].start();
        }
    }
}
