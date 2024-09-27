package org.cash.models;

public class Test {
    //By default, its already null
    private static Test instance = null;

    private Test() {
    }

    public static Test getInstance() {
        if (instance == null) {
            instance = new Test();
        }
        return instance;
    }

}
