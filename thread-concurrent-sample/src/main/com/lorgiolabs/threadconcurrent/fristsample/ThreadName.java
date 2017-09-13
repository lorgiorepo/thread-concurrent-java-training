package com.lorgiolabs.threadconcurrent.fristsample;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class ThreadName {

    public static void main(String[] args) {
        Thread mainTread = Thread.currentThread();
        mainTread.setName("Lorgio Thread");
        System.out.println(mainTread.getName());
    }
}
 