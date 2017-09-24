package com.lorgiolabs.threadconcurrent.visibility;

/**
 * Created by lorgiotrinidad on 15-09-17.
 */
public class MainVisibilityMemory {

    private static volatile Boolean isFinished = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while(!isFinished) {
                try {
                    Thread.sleep(1000L);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
            System.out.println("Task finished.");
        }).start();

        isFinished = true;
        System.out.println("Main finished");
    }
}
