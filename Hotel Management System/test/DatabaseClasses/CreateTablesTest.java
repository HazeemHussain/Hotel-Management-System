/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DatabaseClasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hazeemhussain
 */
public class CreateTablesTest {
    
    public CreateTablesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createuserTable method, of class CreateTables.
     */
    @Test
    public void testCreateuserTable() throws ClassNotFoundException {
        System.out.println("createuserTable");
        CreateTables instance = new CreateTables();
        instance.createuserTable();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of createRoomsTable method, of class CreateTables.
     */
    @Test
    public void testCreateRoomsTable() throws ClassNotFoundException {
        System.out.println("createRoomsTable");
        CreateTables instance = new CreateTables();
        instance.createRoomsTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createCustomerTable method, of class CreateTables.
     */
    @Test
    public void testCreateCustomerTable() throws ClassNotFoundException {
        System.out.println("createCustomerTable");
        CreateTables instance = new CreateTables();
        instance.createCustomerTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class CreateTables.
     */
    @Test
    public void testCloseConnection() throws ClassNotFoundException {
        System.out.println("closeConnection");
        CreateTables instance = new CreateTables();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CreateTables.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CreateTables.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
