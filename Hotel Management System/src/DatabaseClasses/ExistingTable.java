/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClasses;

import java.sql.SQLException;

/**
 * This class check if the table already exits in the database
 */
public class ExistingTable {

    private final DatabaseConnection dbConnection;
    private final java.sql.Connection conn;
    private java.sql.Statement statement;

    public ExistingTable() throws ClassNotFoundException {
        dbConnection = new DatabaseConnection();
        conn = dbConnection.getConnection();
    }

    public boolean checkExistedTable(String name) {
        try {
            var dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};

            statement = this.conn.createStatement();
            java.sql.ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println(tableName);

                if (tableName.equalsIgnoreCase(name)) {
                    //statement.executeUpdate("Drop table " + name);

                    return true;
                }

            }

            rs.close();

        } catch (SQLException ex) {
            System.out.println("SQL EXCEPTION " + ex.getMessage());
        }
        return false;
    }

    public void closeConnection() {
        this.dbConnection.closeConnections();
    }

}
