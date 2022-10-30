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
public class InsertUpdateDeleteTest {
    
    public InsertUpdateDeleteTest() {
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
     * Test of setData method, of class InsertUpdateDelete.
     */
    @Test
    public void testSetData() throws Exception {
        System.out.println("setData");
        String Query = "";
        String msg = "";
        InsertUpdateDelete.setData(Query, msg);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTable method, of class InsertUpdateDelete.
     */
    @Test
    public void testDeleteTable() throws Exception {
        System.out.println("deleteTable");
        String tableName = "";
        String msg = "";
        InsertUpdateDelete.deleteTable(tableName, msg);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
