package com.lorgiolabs.threadconcurrent.firstsample;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class ExtendThread {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println(this.getState());
            }
        };
        thread.start();
    }
}
