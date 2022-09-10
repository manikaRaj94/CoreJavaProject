package com.javaproject.coding.abstractProgram;

public class LinuxServer extends Server{
    public LinuxServer(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("LinuxServer start calling..");
    }

    @Override
    public void stop() {
        System.out.println("LinuxServer stop calling..");
    }
}
