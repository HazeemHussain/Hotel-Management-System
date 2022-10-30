/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import HotelGUI.Checkin;
/**
 *
 * @author hazeemhussain
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DatabaseConnection {

    private static final String USER_NAME = "hotel"; //your DB username
    private static final String PASSWORD = "1234"; //your DB password
    private static final String URL = "jdbc:derby:HotelDB; create=true";  //url of the DB host

    //Connecting to database
    public static Connection getConnection() throws ClassNotFoundException {
        //Establish a connection to Database
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println(URL + "Connection Established");
            return conn; 
        } catch (SQLException ex) {
            System.out.println("CLOSE THE PREVIOUS GUI");
            System.err.println("SQL Exception: " + ex.getMessage());
            return null; 
        }

    }
    


    public static void closeConnections() {
        Connection conn = null;
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

//    public ResultSet queryDB(String sql) {
//
//        Connection connection = this.conn;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return resultSet;
//    }
//
//    public void updateDB(String sql) {
//
//        Connection connection = this.conn;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(sql);
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

}
