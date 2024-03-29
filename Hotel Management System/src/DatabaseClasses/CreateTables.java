/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.derby.iapi.sql.PreparedStatement;
import org.apache.derby.iapi.sql.ResultSet;

/**
 *
 * @author hazeemhussain
 */
public class CreateTables {

    private final DatabaseConnection dbConnection;
    private final java.sql.Connection conn;
    private java.sql.Statement statement;

    public CreateTables() throws ClassNotFoundException {
        dbConnection = new DatabaseConnection();
        conn = dbConnection.getConnection();
    }

    public void createuserTable() {

        try {

            this.statement = conn.createStatement();
            //Dropping table if it exists
            String newTable = "USERLOGIN";
            //Calling existing table class to check if tables exits
            ExistingTable existing = new ExistingTable();
            boolean answer = existing.checkExistedTable(newTable);
            if (answer == true) {
                return;
            } else {
                //Creating table for admin logins
                
                //CREATE TABLE USERLOGIN  ( USERNAME  VARCHAR(50), PASSWORD VARCHAR(50) ) 
                this.statement.addBatch("CREATE TABLE USERLOGIN  ( USERNAME  VARCHAR(50), PASSWORD VARCHAR(50) ) ");
                //Adding values to the table
                this.statement.addBatch("INSERT INTO USERLOGIN VALUES ('aut', 'aut123'), "
                        + "('hazeem', 'hazeem123') ");

                this.statement.executeBatch();
            }

        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "CLOSE THE PREVIOUS GUI");
        }

    }

    //For the the rooms in hotel
    public void createRoomsTable() {
        try {

            this.statement = conn.createStatement();
            //Dropping table if it exists
            String newTable = "ROOMS";
            
           
            ExistingTable existing = new ExistingTable();
            boolean answer = existing.checkExistedTable(newTable);
             //IF table has been created then returning the table else creating the new table
            if (answer == true) {
                return;
            } else {
                //Creating table for rooms in hotel
                this.statement.addBatch("CREATE TABLE ROOMS  ( ROOMNO  VARCHAR(50), BED_TYPE VARCHAR(50),  "
                        + "PRICE INT, STATUS VARCHAR(50) )");
                this.statement.executeBatch();
            }

        } catch (Exception ex) {
            System.out.println("CLOSE THE PREVIOUS GUI");
        }

    }

    //Creating table for all the hotel customers
    public void createCustomerTable() {
        try {

            this.statement = conn.createStatement();
            //Dropping table if it exists
            String newTable = "CUSTOMERDETAILS";
            //Calling existing table class to check if tables exits
            ExistingTable existing = new ExistingTable();
            boolean answer = existing.checkExistedTable(newTable);
            
            //IF table has been created then returning the table else creating the new table
            if (answer == true) {
                return;
            } else {
                //Creating table for customers in hotel
                this.statement.addBatch("CREATE TABLE CUSTOMERDETAILS (IDNO INT, NAME  VARCHAR(50), PHONENUMBER VARCHAR(20), " +
                                         "DRIVERSID VARCHAR(20), ROOMPRICE INT, FOODPRICE INT, TOTALAMOUNT INT, ROOMNO VARCHAR(10), BED_TYPE VARCHAR(50), NO_OF_DAYS INT, CHECKOUT VARCHAR(10))");
                this.statement.executeBatch();
            }

        } catch (Exception ex) {
              System.out.println("CLOSE THE PREVIOUS GUI");
        }
        
    }

    //Checking if the table exists in the library
    public void closeConnection() {
        this.dbConnection.closeConnections();
    }

    public static void main(String[] args) throws ClassNotFoundException {

        CreateTables obj1 = new CreateTables();

        DatabaseConnection dbManager = new DatabaseConnection();
        System.out.println(dbManager.getConnection());

        obj1.createuserTable();
        obj1.createRoomsTable();
        obj1.createCustomerTable();
    }

}
