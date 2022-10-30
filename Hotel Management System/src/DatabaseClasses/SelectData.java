
package DatabaseClasses;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.ResultSet;

public class SelectData {


    public static ResultSet getData(String Query) throws ClassNotFoundException {

        //Declaration of variables
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.getConnection();
            st = conn.createStatement();
            
            //Selecting data and returning it
            rs = st.executeQuery(Query);
            //Returning the result
            return rs;
            
            //Catching errors
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        } catch (NullPointerException ex ) {
            return null;
        }

    }
    
    //Testing this method
//    public static void main(String[] args) throws ClassNotFoundException {
//        String password = "123"; 
//        String userName = "aut";
//        
//      //  System.out.println(getData("SELECT *FROM USERLOGIN WHERE username = '"+userName+"' and password = '"+password+"'"));
//         ResultSet rs = getData("SELECT *FROM ROOMS");
//         System.out.println(rs);
//    }

}
