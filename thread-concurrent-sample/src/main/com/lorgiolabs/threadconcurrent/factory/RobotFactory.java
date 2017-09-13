package com.lorgiolabs.threadconcurrent.factory;

/**
 * Created by lorgiotrinidad on 13-09-17.
 */
public class RobotFactory {

    private final ThreadLocal<Robot> threadLocal;

    public RobotFactory() {
        threadLocal = ThreadLocal.withInitial(Robot::new);
    }

    public Robot getRobot() {
        return threadLocal.get();
    }
}
