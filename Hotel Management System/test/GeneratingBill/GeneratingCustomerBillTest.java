/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GeneratingBill;

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
public class GeneratingCustomerBillTest {
    
    public GeneratingCustomerBillTest() {
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
     * Test of generateBill method, of class GeneratingCustomerBill.
     */
    @Test
    public void testGenerateBill() {
        System.out.println("generateBill");
        int billId = 0;
        String customerName = "";
        String customerPhoneNo = "";
        String driversId = "";
        String roomNo = "";
        String bedType = "";
        String daysStayed = "";
        String pricePerDay = "";
        String totalPrice = "";
        GeneratingCustomerBill.generateBill(billId, customerName, customerPhoneNo, driversId, roomNo, bedType, daysStayed, pricePerDay, totalPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
