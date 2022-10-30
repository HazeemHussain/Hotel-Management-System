/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HotelGUI;

import DatabaseClasses.InsertUpdateDelete;
import DatabaseClasses.SelectData;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author hazeemhussain
 */
public class Checkin extends javax.swing.JFrame {

    /**
     * Creates new form CheckinClass
     */
    //Declaring variables
    String custName;
    String phoneNum;
    String driverID;
    String roomType;
    String bedType;
    String roomNum;
    int noOfDays;
    int roomPrice;
    int id;

    public Checkin() {
        initComponents();
        roomPriceTextField.setEditable(false);
    }

    //Calling this method to clear the fields
    private void clearFields() {
        roomPriceTextField.setText("");
        // custPhoneNoTextField.setText("");
        //custNameTextField.setText("");
        //custIDTextField.setText("");
        roomNumComboBox.removeAllItems();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        closebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        custNameTextField = new javax.swing.JTextField();
        custIDTextField = new javax.swing.JTextField();
        custPhoneNoTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        roomNumComboBox = new javax.swing.JComboBox<>();
        roomPriceTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        noOfDaysComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        bookRoomButton = new javax.swing.JButton();
        clearDataButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back Button.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL CHECK IN");

        closebutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close Button.png"))); // NOI18N
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Enter your name ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Enter your Phone Number");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Enter your Driver's ID ");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PICK A ROOM");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("YOUR DETAILS");

        custNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTextFieldActionPerformed(evt);
            }
        });

        custIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDTextFieldActionPerformed(evt);
            }
        });

        custPhoneNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPhoneNoTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("ROOM TYPE");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("ROOM NO");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("ROOM PRICE");

        roomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple", "Queen", "King", "Appartment" }));
        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });

        roomNumComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumComboBoxActionPerformed(evt);
            }
        });

        roomPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("NO OF DAYS");

        noOfDaysComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        noOfDaysComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfDaysComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("ROOMS AVAILABILITY");

        bookRoomButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        bookRoomButton.setText("BOOK ROOM");
        bookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomButtonActionPerformed(evt);
            }
        });

        clearDataButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        clearDataButton.setText("CLEAR DATA");
        clearDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDataButtonActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(51, 51, 51));
        jTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable.setForeground(new java.awt.Color(204, 204, 204));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(444, 444, 444)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(custIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(custNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(custPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(noOfDaysComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(roomNumComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(roomTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(roomPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(444, 444, 444)
                                        .addComponent(bookRoomButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearDataButton)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(184, 184, 184)
                        .addComponent(closebutton)
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closebutton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(roomNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(noOfDaysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(custNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(roomPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookRoomButton)
                    .addComponent(clearDataButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
        //Closes the program if user clicks this button
        int close = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the program?", "Select", JOptionPane.YES_NO_OPTION);
        if (close == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closebuttonActionPerformed

    private void custNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_custNameTextFieldActionPerformed

    private void custIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_custIDTextFieldActionPerformed

    private void custPhoneNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPhoneNoTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_custPhoneNoTextFieldActionPerformed

    //Displays rooms table
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        JTableHeader header = jTable.getTableHeader();
        // ((DefaultTableCellRenderer)header.getDefaultRenderer()).setBackground(Color.BLACK);
        header.setFont(new Font("Helvetica Neue", Font.BOLD, 14));

        try {
            // TODO add your handling code here:
            //select data from rooms table

            ResultSet rs = SelectData.getData("SELECT *FROM ROOMS");
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();

            //Reading data from rooms table and displaying it 
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formComponentShown

    private void roomNumComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumComboBoxActionPerformed

        //Getting the room num user selected 
        roomNum = (String) roomNumComboBox.getSelectedItem();

        try {
            ResultSet rs = SelectData.getData("SELECT *FROM ROOMS WHERE ROOMNO = '" + roomNum + "'");

            //Displaying the price of the selected room into price field text
            while (rs.next()) {
                roomPriceTextField.setText(rs.getString(3));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_roomNumComboBoxActionPerformed

    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        // TODO add your handling code here:

        //Clearing fields
        clearFields();
        
        //Getting the selected roomtype
        roomType = (String) roomTypeComboBox.getSelectedItem();

        try {
            
            ResultSet rs = SelectData.getData("SELECT *FROM ROOMS WHERE BED_TYPE = '" + roomType + "' AND STATUS = 'Not Booked' ");

            while (rs.next()) {
                //Adding the room numbers for the particular type that are not booked to the Room number combo box
                roomNumComboBox.addItem(rs.getString(1));
                //roomPriceTextField.setText();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed

    //No of days comb box
    private void noOfDaysComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfDaysComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_noOfDaysComboBoxActionPerformed

    //TextField of room price 
    private void roomPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomPriceTextFieldActionPerformed

    private void clearDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDataButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Checkin().setVisible(true);
    }//GEN-LAST:event_clearDataButtonActionPerformed

    //Getting data from fields and booking a room for the user
    private void bookingRoom() throws ClassNotFoundException, SQLException {
        //Getting data from all the fields
        int id = 1;
        String phoneNum = custPhoneNoTextField.getText();
        String custName = custNameTextField.getText();
        String driverID = custIDTextField.getText();
        int roomPrice = 0;
        int noOfDays = 0;

        //Converting the String textfields to integer
        try {
            roomPrice = Integer.parseInt(roomPriceTextField.getText());
            noOfDays = Integer.parseInt((String) noOfDaysComboBox.getSelectedItem());

        } catch (NumberFormatException ex) {
            // JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }

        //GETTING DATA FROM COMBO BOXES
        String roomNum = (String) roomNumComboBox.getSelectedItem();
        String roomType = (String) roomTypeComboBox.getSelectedItem();

        String Query1 = "SELECT max(IDNO) FROM CUSTOMERDETAILS";
        String Query2;
        String Query3 = "";
        ResultSet rs = SelectData.getData(Query1);

        //Getting max idno from the customer details table
        while (rs.next()) {
            id = rs.getInt(1);
            id = id + 1;
        }

        //Checking that all the text fields are filled
        if (custName.equals("") || phoneNum.equals("") || driverID.equals("")) {
            JOptionPane.showMessageDialog(null, "FILL IN ALL THE DETAILS");

        } //Checking if the user has picked a room if not then displaying an error
        else if (!roomPriceTextField.getText().equals("")) {

            //CONFIRMING DETAILS FROM THE USER
            int close = JOptionPane.showConfirmDialog(null, 
                      "YOUR NAME: " + custName
                    + "\nYOUR PHONE NUMBER: " + phoneNum
                    + "\nYOUR DRIVER'S ID: " + driverID
                    + "\nYOUR ROOM NO: " + roomNum
                    + "\nROOM SELECTED: " + roomType
                    + "\nNO OF DAYS YOU WANT TO STAY: " + noOfDays
                    + "\nYOUR TOTAL PRICE: " + roomPrice,
                    "ARE YOUR DETAILS CORRECT?", JOptionPane.YES_NO_OPTION);
            
            //If user details are correct then entering user details in the databse
            if (close == 0) {
                //Inserting customer details into "Customer details table
                
                
                
                Query3 = "INSERT INTO CUSTOMERDETAILS (IDNO, NAME, PHONENUMBER, DRIVERSID, ROOMPRICE, ROOMNO, BED_TYPE, NO_OF_DAYS) VALUES "
                        + "( " + id + " , '" + custName + "' , '" + phoneNum + "' , "
                        + " '" + driverID + "' , " + roomPrice + " , '" + roomNum + "' , "
                        + " '" + roomType + "' , " + noOfDays + " )";
                //Update the customer details table
                InsertUpdateDelete.setData(Query3, "ROOM NO: " + roomNum + " HAS BEEN BOOKED FOR " + custName);
                
                
                
                

                //Changing the status of the room to booked if the user confirmed the details
                Query2 = "UPDATE ROOMS SET STATUS = 'Booked' WHERE ROOMNO = '" + roomNum + "'";
                InsertUpdateDelete.setData(Query2, "");
                
                int close2 = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO GO TO CHECK OUT PAGE");
                if (close2 == 0) {
                    //Clearing checkin frame fields
                    setVisible(false); 
                   new Checkout().setVisible(true);
                } else {
                    new Checkin().setVisible(true);
                }
                
            } else {
                //If selection is no
                JOptionPane.showMessageDialog(null, "YOU CAN MAKE CHANGES TO YOUR DETAILS");
                setVisible(true);
            }

        } else {
            //If user hasnt picked a room
            JOptionPane.showMessageDialog(null, "SELECT A ROOM");
        }

    }

    private void bookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomButtonActionPerformed
        try {
            // TODO add your handling code here:

            //Calling booking room class if click book button
            bookingRoom();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookRoomButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookRoomButton;
    private javax.swing.JButton clearDataButton;
    private javax.swing.JButton closebutton;
    private javax.swing.JTextField custIDTextField;
    private javax.swing.JTextField custNameTextField;
    private javax.swing.JTextField custPhoneNoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> noOfDaysComboBox;
    private javax.swing.JComboBox<String> roomNumComboBox;
    private javax.swing.JTextField roomPriceTextField;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
