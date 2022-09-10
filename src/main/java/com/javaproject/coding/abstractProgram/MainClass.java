package com.javaproject.coding.abstractProgram;

public class MainClass {
    public static void main(String[] args) {
        Server windowsServer = new WindowsServer("Windows");
        LinuxServer linuxServer = new LinuxServer("Linux");

        windowsServer.start();
        windowsServer.ServerTest();
        windowsServer.stop();

        System.out.println("Windows Server name : "+windowsServer.name);

        linuxServer.start();
        linuxServer.ServerTest();
        linuxServer.stop();

        System.out.println("Windows Server name : "+linuxServer.name);

    }
}
