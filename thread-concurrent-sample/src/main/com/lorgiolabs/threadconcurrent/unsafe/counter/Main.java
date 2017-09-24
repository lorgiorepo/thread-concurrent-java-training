package com.lorgiolabs.threadconcurrent.unsafe.counter;

/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class Main {

    public static void main(String[] args) {

        UnsafeCounter counter = new UnsafeCounter();
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Task(counter, 10));
            threads[i].start();
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        System.out.println("The total was: " + counter.getCount());
    }
}
