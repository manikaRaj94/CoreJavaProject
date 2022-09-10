package com.javaproject.coding.abstractProgram;

public abstract class Server {

    public String name ;

    public Server(String name) {
        this.name = name;
    }

    public abstract void start();
    public abstract void stop();
    public void ServerTest()
    {
        System.out.println("ServerTest calling..");
    }

}
