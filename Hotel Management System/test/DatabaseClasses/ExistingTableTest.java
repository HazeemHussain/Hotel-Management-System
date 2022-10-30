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
public class ExistingTableTest {
    
    public ExistingTableTest() {
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
     * Test of checkExistedTable method, of class ExistingTable.
     */
    @Test
    public void testCheckExistedTable() throws ClassNotFoundException {
        System.out.println("checkExistedTable");
        String name = "";
        ExistingTable instance = new ExistingTable();
        boolean expResult = false;
        boolean result = instance.checkExistedTable(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class ExistingTable.
     */
    @Test
    public void testCloseConnection() throws ClassNotFoundException {
        System.out.println("closeConnection");
        ExistingTable instance = new ExistingTable();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
