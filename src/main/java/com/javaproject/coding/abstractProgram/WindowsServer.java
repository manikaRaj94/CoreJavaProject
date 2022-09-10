package com.javaproject.coding.abstractProgram;

public class WindowsServer extends Server{
    public WindowsServer(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("WindowsServer start calling..");
    }

    @Override
    public void stop() {
        System.out.println("WindowsServer stop calling..");

    }
}
