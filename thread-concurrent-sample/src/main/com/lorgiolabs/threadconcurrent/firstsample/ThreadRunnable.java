package com.lorgiolabs.threadconcurrent.firstsample;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class ThreadRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread with runnable with id: " + Thread.currentThread().getId());
            }
        });

        thread.start();
    }
}
