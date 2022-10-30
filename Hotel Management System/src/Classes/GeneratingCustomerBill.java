/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author hazeemhussain
 */
public class GeneratingCustomerBill {
    
    
    
    public static void generateBill(String customerName, String customerPhoneNo, String driversId, String roomNo,
                                     String bedType , String daysStayed, String totalPrice) {
         com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        
        String path = "Invoice";
        
        try {
              PdfWriter.getInstance(document, new FileOutputStream(path + "" + customerName + ".pdf"));
             document.open();
             
             Paragraph para1 = new Paragraph("HOTEL MANAGEMENT SYSTEM");
             document.add(para1);
             
             Paragraph para2 = new Paragraph("CUSTOMER BILL");
             document.add(para2);
             
             Paragraph para3 = new Paragraph("CUSTOMER NAME: " + customerName + "\nCUSTOMER MOBILE NUMBER: " + customerPhoneNo 
                     +  "\nCUSTOMER ID: " + driversId);
             document.add(para3);
             
             
             Paragraph para4 = new Paragraph("\nROOM STAYED IN: " + roomNo + "\nBED TYPE: " + 
                            bedType + "\nDays Stayed: " + daysStayed);
             document.add(para4);
             
             Paragraph para5 = new Paragraph("THANK YOU FOR USING OUR SERVICE!");
             document.add(para5);
         
        
        
             document.close();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not generate the bill");
        }
        
       
        
    }
    
    public static void main(String[] args) {
        generateBill("Hazeem" , "1234556", "AS123456", "21", "Double", "2", "100");
    }
}
