package com.lorgiolabs.threadconcurrent.unsafe;

/**
 * Created by lorgiotrinidad on 24-09-17.
 */
public class LazyInit {

    private Object instance = null;

    public Object getInstance() {
        if(instance == null) {
            instance = new Object();
        }
        return instance;
    }
}
