/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import loveguitars.assignemnt.Customer;

/**
 *
 * @author Tatiana
 */
public class AddCustomerFrameForm extends javax.swing.JInternalFrame {

    /**
     * declare calendar data to work with date of birth
     */
    DateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    Date date=new Date();
    Calendar cal=Calendar.getInstance();
    
    
    
    
    public AddCustomerFrameForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aSerialLabel = new javax.swing.JLabel();
        cIDTextField = new javax.swing.JTextField();
        aYearLabel = new javax.swing.JLabel();
        aColourLabel = new javax.swing.JLabel();
        cLicenseTextField = new javax.swing.JTextField();
        aWidthLabel = new javax.swing.JLabel();
        cAgeTextField = new javax.swing.JTextField();
        aHeightLabel = new javax.swing.JLabel();
        cPhoneTextField = new javax.swing.JTextField();
        aModelLabel = new javax.swing.JLabel();
        aBuilderLabel = new javax.swing.JLabel();
        cAddressTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        addCButton = new javax.swing.JButton();
        aLengthLabel = new javax.swing.JLabel();
        cNameTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        aWidthLabel1 = new javax.swing.JLabel();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        cButton = new javax.swing.JButton();
        birthXDatePicker = new com.toedter.calendar.JDateChooser();
        cExpiryXDatePicker = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(666, 646));

        jPanel1.setBackground(new java.awt.Color(34, 41, 48));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(666, 646));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        aSerialLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aSerialLabel.setForeground(new java.awt.Color(78, 177, 186));
        aSerialLabel.setText("ID");

        aYearLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aYearLabel.setForeground(new java.awt.Color(78, 177, 186));
        aYearLabel.setText("Name");

        aColourLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aColourLabel.setForeground(new java.awt.Color(78, 177, 186));
        aColourLabel.setText("Date of Birth");

        aWidthLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aWidthLabel.setForeground(new java.awt.Color(78, 177, 186));
        aWidthLabel.setText("Gender");

        cAgeTextField.setEditable(false);

        aHeightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aHeightLabel.setForeground(new java.awt.Color(78, 177, 186));
        aHeightLabel.setText("License Expiry date");

        aModelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aModelLabel.setForeground(new java.awt.Color(78, 177, 186));
        aModelLabel.setText("Address");

        aBuilderLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aBuilderLabel.setForeground(new java.awt.Color(78, 177, 186));
        aBuilderLabel.setText("Phone");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(233, 233, 233));
        jLabel16.setText("License details");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(233, 233, 233));
        jLabel18.setText("Personal information");

        addCButton.setBackground(new java.awt.Color(78, 177, 186));
        addCButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addCButton.setForeground(new java.awt.Color(34, 41, 48));
        addCButton.setText("Add Customer");
        addCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCButtonActionPerformed(evt);
            }
        });

        aLengthLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLengthLabel.setForeground(new java.awt.Color(78, 177, 186));
        aLengthLabel.setText("License Number");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(233, 233, 233));
        jLabel19.setText("Contact details");

        aWidthLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aWidthLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aWidthLabel1.setText("Age");

        mRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mRadioButton.setForeground(new java.awt.Color(78, 177, 186));
        mRadioButton.setText("Male");
        mRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRadioButtonActionPerformed(evt);
            }
        });

        fRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fRadioButton.setForeground(new java.awt.Color(78, 177, 186));
        fRadioButton.setText("Female");
        fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRadioButtonActionPerformed(evt);
            }
        });

        cButton.setBackground(new java.awt.Color(78, 177, 186));
        cButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cButton.setForeground(new java.awt.Color(34, 41, 48));
        cButton.setText("calculate");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aSerialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aYearLabel)
                            .addComponent(cNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(cButton))
                                    .addComponent(birthXDatePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(aWidthLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aModelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aBuilderLabel)
                            .addComponent(cPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aHeightLabel)
                            .addComponent(cLicenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cExpiryXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aColourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aWidthLabel)
                            .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aLengthLabel)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(addCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aSerialLabel)
                    .addComponent(aModelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aYearLabel)
                    .addComponent(aBuilderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aColourLabel)
                    .addComponent(jLabel16))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aLengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cLicenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aHeightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cExpiryXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(birthXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(aWidthLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(aWidthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(addCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private char findGender()
{ 
 if(mRadioButton.isSelected())
            {
                return 'M';
            }else 
            {
                return 'F';
            }     
}


    private void addCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCButtonActionPerformed
        // adding new guitar to the array list:

        if (cIDTextField.getText().length()<=0 ||cNameTextField.getText().length()<=0||
            cAddressTextField.getText().length()<=0||cAgeTextField.getText().length()<=0 ||
            cLicenseTextField.getText().length()<=0||cPhoneTextField.getText().length()<=0)
        {
            JOptionPane.showMessageDialog(null, "Some fields are empty, please add more data");
        }
        else
        {
            String id=cIDTextField.getText();
            String name=cNameTextField.getText();
            Date dateOfBirth=birthXDatePicker.getDate();
            String address= cAddressTextField.getText();
            String phone=cPhoneTextField.getText();
            String license=cLicenseTextField.getText();
            int age=Integer.parseInt(cAgeTextField.getText());
            Date expiry=cExpiryXDatePicker.getDate();
            //cheching if ID expiry date not past today date
            long days=Dashboard.shop.checkID(expiry);
            if(days>=0)
            {
                JOptionPane.showMessageDialog(this, "Please update document expiry date");
            }else{
                //checking gender
            char gender=findGender();
            // creating new customer object
            Customer c=new Customer(license, age, expiry, gender, id, name, 
                    dateOfBirth, address, phone);
            // adding new customer to the array list
            String output=Dashboard.staff.addCustomer(c, Dashboard.shop);
            JOptionPane.showMessageDialog(this, output);
            //set fields to be empty for new entry
            cIDTextField.setText("");
            cNameTextField.setText("");
            cAddressTextField.setText("");
            birthXDatePicker.setDate(null);
            cAgeTextField.setText("");
            cPhoneTextField.setText("");
            cLicenseTextField.setText("");
            cExpiryXDatePicker.setDate(null);
            fRadioButton.setSelected(false);
            mRadioButton.setSelected(false);
        }
        }
    }//GEN-LAST:event_addCButtonActionPerformed

    private void mRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRadioButtonActionPerformed
        // seting up that only 1 radiobutton can be choosen at a time:
        if (mRadioButton.isSelected());
        fRadioButton.setSelected(false); 
    }//GEN-LAST:event_mRadioButtonActionPerformed

    private void birthXDatePickerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_birthXDatePickerPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_birthXDatePickerPropertyChange
 
    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // calculate age in years from Date of Birth, calling method calculateYears from the shop       
        LocalDate today=LocalDate.now();
        Date dateOfBirth=birthXDatePicker.getDate();
        int years=Dashboard.shop.calculateYears(today, dateOfBirth);
        cAgeTextField.setText(years+"");
    }//GEN-LAST:event_cButtonActionPerformed

    private void fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRadioButtonActionPerformed
        // setting up that only 1 radio button can be choosen at a time
        if (fRadioButton.isSelected());
        mRadioButton.setSelected(false);
    }//GEN-LAST:event_fRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aBuilderLabel;
    private javax.swing.JLabel aColourLabel;
    private javax.swing.JLabel aHeightLabel;
    private javax.swing.JLabel aLengthLabel;
    private javax.swing.JLabel aModelLabel;
    private javax.swing.JLabel aSerialLabel;
    private javax.swing.JLabel aWidthLabel;
    private javax.swing.JLabel aWidthLabel1;
    private javax.swing.JLabel aYearLabel;
    private javax.swing.JButton addCButton;
    private com.toedter.calendar.JDateChooser birthXDatePicker;
    private javax.swing.JTextField cAddressTextField;
    private javax.swing.JTextField cAgeTextField;
    private javax.swing.JButton cButton;
    private com.toedter.calendar.JDateChooser cExpiryXDatePicker;
    private javax.swing.JTextField cIDTextField;
    private javax.swing.JTextField cLicenseTextField;
    private javax.swing.JTextField cNameTextField;
    private javax.swing.JTextField cPhoneTextField;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton mRadioButton;
    // End of variables declaration//GEN-END:variables
}
