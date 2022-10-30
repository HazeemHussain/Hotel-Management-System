/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author hazeemhussain
 */
public class GeneratingCustomerBill {
    
    
    
    public static void generateBill(int billId, String customerName, String customerPhoneNo, String driversId, String roomNo,
                                     String bedType , String daysStayed, String pricePerDay, String totalPrice) {
         com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        
        String path = "Invoice";
        
        try {
              PdfWriter.getInstance(document, new FileOutputStream(path + "For Customer" + billId + ".pdf"));
             document.open();
             
             //Paragraph 1
             Paragraph para1 = new Paragraph("****************************************************************************************************************\n"
                                           + "                                                     HOTEL MANAGEMENT SYSTEM" +
                                           "\n****************************************************************************************************************\n");
             document.add(para1);
             
             //Second Paragraph
             Paragraph para2 = new Paragraph("CUSTOMER INVOICE \n\n CUSTOMER DETAILS\n");
             para2.setAlignment(Element.ALIGN_CENTER);
             document.add(para2);
           
             //Third Paragraph
             Paragraph para3 = new Paragraph("Customer Name: " + customerName + "\nCustomer Mobile NO: " + customerPhoneNo 
                     +  "\nCustomer's ID: " + driversId);
             para3.setAlignment(Element.ALIGN_CENTER);
             document.add(para3);
             
             //Fourth Paragraph
             Paragraph para4 = new Paragraph("****************************************************************************************************************"
                                                + "\nROOMS DETAILS\n"
                                                + "\nRoom Stayed In -> " + roomNo + "\nBed Type -> '" 
                                                + bedType + "'\nDays Stayed: " + daysStayed + "\nPrice Per Day = " + pricePerDay 
                                                + "\nTotal Price = " + totalPrice);
             para4.setAlignment(Element.ALIGN_CENTER);
             document.add(para4);
             
             //Fifth Paragraph
             Paragraph para5 = new Paragraph("\n****************************************************************************************************************"
                                            + "\n                                        THANK YOU FOR USING OUR HOTEL SERVICE\n"
                                            + "****************************************************************************************************************");
             document.add(para5);
         
        
             //Closing pdf
             document.close();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not generate the bill");
        }
        
        
        JOptionPane.showMessageDialog(null, "Bill has been created in the project folder");
       
        
    }
    
    
    
//    public static void main(String[] args) {
//        generateBill(1, "Hazeem" , "1234556", "AS123456", "21", "Double", "2", "50", "100");
//    }
}
