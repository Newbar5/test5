package org.example;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "12345";
            Connection connection = DriverManager.getConnection(url, username, password);
            //print(connection);
            printOnlyEmail(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void print(Connection connection){
        try {
            String selectQuery = "SELECT * FROM demo2";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("Id");
                String email = resultSet.getString("emailCustomer");
                System.out.println("ID: " + id + ", Email: " + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printOnlyEmail(Connection connection){
        try {
            String selectQuery = "SELECT emailCustomer FROM demo2 where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1,2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                String email = resultSet.getString("emailCustomer");
                System.out.println( "Email: " + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}