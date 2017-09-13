package com.lorgiolabs.threadconcurrent.firstsample;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class ThreadName {

    public static void main(String[] args) {
        Thread mainTread = Thread.currentThread();
        mainTread.setName("Lorgio Thread");
        System.out.println(mainTread.getId());
        System.out.println(mainTread.getName());
        System.out.println(mainTread.getPriority());
        System.out.println(mainTread.getState());
    }
}
