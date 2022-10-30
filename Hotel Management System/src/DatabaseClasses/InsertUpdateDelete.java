/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

/**
 *
 * @author hazeemhussain
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertUpdateDelete {

    //Method to insert data in the table
    public static void setData(String Query, String msg) throws ClassNotFoundException {
        Connection conn = null;
        Statement statement = null;

        try {
            //Connection to database
            conn = DatabaseConnection.getConnection();
            statement = conn.createStatement();

            //Entering data into the table
            statement.executeUpdate(Query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
    //Method to delete tables
    public static void deleteTable(String tableName, String msg) throws ClassNotFoundException {
        Connection conn = null;
        Statement statement = null;

        try {
            //Connection to database
            conn = DatabaseConnection.getConnection();
            statement = conn.createStatement();

            //Executing statmenet
            statement.executeUpdate("DROP TABLE " + tableName);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        
        //Inserting values into userlogin
//        setData("INSERT INTO USERLOGIN VALUES ('aut', 'aut123'), "
//                + "('hazeem', 'hazeem123') ", "Inserted values");

  //       deleteTable ("CUSTOMERDETAILS", "Table deleted");
           //deleteTable ("rooms", "Table deleted");
          
          //inserting values into rooms table
//         setData("INSERT INTO ROOMS VALUES "
//                  + "('01', 'Single',     200 ,  'Not Booked'), "
//                  + "('02', 'Single',     200 ,  'Not Booked'),  "
//                  + "('03', 'Single',     200 ,  'Not Booked'),  "
//                  + "('04', 'Double',     300 ,  'Not Booked'),  "
//                  + "('05', 'Double',     300 ,  'Not Booked'),  "
//                  + "('06', 'Double',     300 ,  'Not Booked'),  "
//                  + "('07', 'Triple',     400 ,  'Not Booked'),  "
//                  + "('08', 'Triple',     400 ,  'Not Booked'),  "
//                  + "('09', 'Triple',     400 ,  'Not Booked'),  "
//                  + "('10', 'Queen',      600 , 'Not Booked'),  "
//                  + "('11', 'Queen',      600 , 'Not Booked'),  "
//                  + "('12', 'King',       800 ,  'Not Booked'),  "
//                  + "('13', 'King',       800 ,  'Not Booked'),  "
//                  + "('14', 'King',       800 ,  'Not Booked'),  "
//                  + "('15', 'King',       800 ,  'Not Booked'),   "
//                  + "('16', 'Appartment', 1000 , 'Not Booked'),  "
//                  + "('17', 'Appartment', 1000 , 'Not Booked'),  "
//                  + "('18', 'Appartment', 1000 , 'Not Booked'),  "
//                  + "('19', 'Appartment', 1000 , 'Not Booked'),   "
//                  + "('20', 'Appartment', 1000 , 'Not Booked')  ", "Values have been inserted");

//etData("UPDATE ROOMS SET STATUS = 'Not Booked' WHERE ROOMNO = '10'", "Updated");


                        
    }
}
