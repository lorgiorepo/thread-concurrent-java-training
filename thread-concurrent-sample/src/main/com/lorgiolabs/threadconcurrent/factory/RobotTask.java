package com.lorgiolabs.threadconcurrent.factory;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class RobotTask implements Runnable{

    private RobotFactory factory;

    public RobotTask(RobotFactory factory){
        this.factory = factory;
    }

    @Override
    public void run() {
        Robot robot = factory.getRobot();
        System.out.println(Thread.currentThread().getName() + " got " + robot);
        robot = factory.getRobot();
        System.out.println(Thread.currentThread().getName() + " got " + robot);
    }
}
