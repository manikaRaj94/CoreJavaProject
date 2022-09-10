package com.javaproject.coding.constructor;

public class Bank {

    public static String BANK_NAME = "HDFC";
    public static String BANCK_IFSC = "HDFC0004166";

    public int accountNo;
    public String customerName;

    public Bank(int accountNo) {
        this.accountNo = accountNo;
    }

    public Bank(String customerName) {
        this.customerName = customerName;
    }

    public Bank()
    {
        this.accountNo = 1124458;
        this.customerName ="Manika Raj";
    }

    public Bank(int accountNo, String customerName) {
        this.accountNo = accountNo;
        this.customerName = customerName;
    }
}
