package com.javaproject.coding.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDAO {
    public String insertIntoContact(Contact contact) throws SQLException {
        Connection connection = null;
        String response = null;
        try {
            connection = DBConnection.connectionUsingProperty();
            String sql = "INSERT INTO contact(name,email_id,address,telephone) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, contact.getName());
            preparedStatement.setString(2, contact.getEmail_id());
            preparedStatement.setString(3, contact.getAddress());
            preparedStatement.setString(4, contact.getTelephone());

            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted > 0) {
                response = String.valueOf(rowInserted).concat(" Row Inserted Successfully");
            } else {
                response = String.valueOf(rowInserted).concat(" Affected");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
        return response;
    }

    public String updateContact(Contact contact) throws SQLException {
        Connection connection = null;
        String response = null;
        try {
            connection = DBConnection.connectionUsingProperty();
            String sql = "Update contact set telephone=? where id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, contact.getTelephone());
            preparedStatement.setInt(2, contact.getId());


            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted > 0) {
                response = String.valueOf(rowInserted).concat(" Row Updated Successfully");
            } else {
                response = String.valueOf(rowInserted).concat(" Affected");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
        return response;
    }

    public String deleteFromContact(Contact contact) throws SQLException {
        Connection connection = null;
        String response = null;
        try {
            connection = DBConnection.connectionUsingProperty();
            String sql = "DELETE FROM contact WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, contact.getId());


            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted > 0) {
                response = String.valueOf(rowInserted).concat(" Row Deleted Successfully");
            } else {
                response = String.valueOf(rowInserted).concat(" Affected");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
        return response;
    }

    public Contact getAllContact(Contact contact) throws SQLException {
        Connection connection = null;
        Contact contact1 = new Contact();
        String response = null;
        try {
            connection = DBConnection.connectionUsingProperty();
            String sql = "SELECT *  FROM contact;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            ResultSet contactTableResultSet = preparedStatement.executeQuery();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
        return contact1;
    }
}
