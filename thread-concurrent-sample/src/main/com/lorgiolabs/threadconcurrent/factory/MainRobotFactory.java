package com.lorgiolabs.threadconcurrent.factory;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class MainRobotFactory {

    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();
        Thread[] threads = new Thread[4];

        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new RobotTask(factory));
            threads[i].start();
        }
    }
}
