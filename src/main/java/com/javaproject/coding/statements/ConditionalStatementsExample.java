package com.javaproject.coding.statements;

public class ConditionalStatementsExample {

    public void ifStatementExample() {
        int a = 10;
        int b = 20;
        if (a != b) {
            System.out.println(" a!=b");
        }
        System.out.println("if Statement");
    }

    public void ifElseStatementExample() {
        int a = 10;
        int b = 20;
        if (a != b) {
            System.out.println(" a!=b");
        } else {
            System.out.println(" a == b");
        }
        System.out.println("if else Statement");
    }

    public void ifElseIfStatementExample() {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println(" a==b");
        } else if (a < b) {
            System.out.println(" a <b");
        } else if (a > b) {
            System.out.println("a>b");
        }
        System.out.println("if else if Statement");
    }

    public void switchCaseStatement() {
        int a = 11;


        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("default");

        }
    }
}
