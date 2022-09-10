package com.javaproject.coding.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCMain {
    public static void main(String[] args) throws SQLException, IOException {
        // DBConnection.connectionUsingHardCode();
        //    DBConnection.connectionUsingUrl();
        ContactDAO contactDAO = new ContactDAO();
        Contact insertContact = new Contact();
        insertContact.setName("Santosh Swaraj");
        insertContact.setEmail_id("santoshSwaraj@gmail.com");
        insertContact.setAddress("Varanasi");
        insertContact.setTelephone("7253164895");

       // System.out.println(contactDAO.insertIntoContact(insertContact));

        Contact updateContact = new Contact();
        updateContact.setTelephone("864352311");
        updateContact.setId(2);

       // System.out.println(contactDAO.updateContact(updateContact));

        Contact deleteContact = new Contact();
        deleteContact.setId(2);

        System.out.println(contactDAO.deleteFromContact(deleteContact));

    }
}
