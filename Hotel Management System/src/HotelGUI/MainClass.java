/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HotelGUI;

/**
 *
 * @author hazeemhussain
 */
import HotelGUI.Login;
import DatabaseClasses.CreateTables; 
import javax.swing.JOptionPane;
public class MainClass {

    /*
    IMPORTANT INFO
    1. All the classes have main methods. If you want to run specific class then you can uncomment the 
       method and run it
    
    2. All the test casses classes are in the test packages folder
    
    3. This was one of the best paper i ever took. I absolutely loved everything about this paper i.e: Teachers, lectures
    tutorials everything. Thank you so much
    */
    public static void main(String[] args) throws ClassNotFoundException {
        //Creating tables
        try {
            
        
        CreateTables.main(args);
        
        //Generating login gui
        Login.run();
       } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "CLOSE THE PREVIOUS GUI");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CLOSE THE PREVIOUS GUI");
        }
    }
    
}
