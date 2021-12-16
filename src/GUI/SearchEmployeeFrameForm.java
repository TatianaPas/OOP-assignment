/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Dashboard;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import loveguitars.assignemnt.Employee;

/**
 *
 * @author Tatiana
 */
public class SearchEmployeeFrameForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddGuitarFrameForm
     */
    public SearchEmployeeFrameForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        //set data fields invisible
        employeePanel.setVisible(false);
        sPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        aSerialLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        sPanel = new javax.swing.JPanel();
        aColourLabel1 = new javax.swing.JLabel();
        dbirthXDatePicker = new com.toedter.calendar.JDateChooser();
        aYearLabel1 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        aModelLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        aBuilderLabel1 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        employeePanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        aLengthLabel3 = new javax.swing.JLabel();
        eExtensionTextField = new javax.swing.JTextField();
        aWidthLabel5 = new javax.swing.JLabel();
        eRoleTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        aHeightLabel4 = new javax.swing.JLabel();
        eUsernameTextField = new javax.swing.JTextField();
        aHeightLabel5 = new javax.swing.JLabel();
        ePasswordTextField = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(34, 41, 48));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(666, 646));

        aSerialLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aSerialLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aSerialLabel1.setText("ID");

        searchButton.setBackground(new java.awt.Color(78, 177, 186));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(78, 177, 186));
        resetButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(78, 177, 186));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        sPanel.setBackground(new java.awt.Color(34, 41, 48));

        aColourLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aColourLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aColourLabel1.setText("Date of Birth");

        dbirthXDatePicker.setDateFormatString("dd/MM/yyyy");
        dbirthXDatePicker.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dbirthXDatePickerPropertyChange(evt);
            }
        });

        aYearLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aYearLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aYearLabel1.setText("Name");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(233, 233, 233));
        jLabel20.setText("Personal information");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(233, 233, 233));
        jLabel21.setText("Contact details");

        aModelLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aModelLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aModelLabel1.setText("Address");

        aBuilderLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aBuilderLabel1.setForeground(new java.awt.Color(78, 177, 186));
        aBuilderLabel1.setText("Phone");

        employeePanel.setBackground(new java.awt.Color(34, 41, 48));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(233, 233, 233));
        jLabel23.setText("Work details");

        aLengthLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLengthLabel3.setForeground(new java.awt.Color(78, 177, 186));
        aLengthLabel3.setText("Phone extension");

        aWidthLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aWidthLabel5.setForeground(new java.awt.Color(78, 177, 186));
        aWidthLabel5.setText("role");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(233, 233, 233));
        jLabel25.setText("Login details");

        aHeightLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aHeightLabel4.setForeground(new java.awt.Color(78, 177, 186));
        aHeightLabel4.setText("Username");

        aHeightLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aHeightLabel5.setForeground(new java.awt.Color(78, 177, 186));
        aHeightLabel5.setText("Password");

        javax.swing.GroupLayout employeePanelLayout = new javax.swing.GroupLayout(employeePanel);
        employeePanel.setLayout(employeePanelLayout);
        employeePanelLayout.setHorizontalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aLengthLabel3)
                    .addComponent(eExtensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aWidthLabel5)
                    .addComponent(eRoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aHeightLabel4)
                    .addComponent(ePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aHeightLabel5)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employeePanelLayout.setVerticalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeePanelLayout.createSequentialGroup()
                        .addComponent(aLengthLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eExtensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aWidthLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eRoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(employeePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aHeightLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aHeightLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout sPanelLayout = new javax.swing.GroupLayout(sPanel);
        sPanel.setLayout(sPanelLayout);
        sPanelLayout.setHorizontalGroup(
            sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aYearLabel1)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aColourLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbirthXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aModelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aBuilderLabel1)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(employeePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sPanelLayout.setVerticalGroup(
            sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aYearLabel1)
                    .addComponent(aModelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aColourLabel1)
                    .addComponent(aBuilderLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbirthXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(employeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aSerialLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(aSerialLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // search employee

        String ID =idTextField.getText();
        Employee employee=Dashboard.staff.searchEmployee(ID, Dashboard.shop);
        if (employee==null)
        {
            JOptionPane.showMessageDialog(this, "No employee found");
        }else
        {// set data fields visible
            sPanel.setVisible(true);
            employeePanel.setVisible(true);  
            NameTextField.setText(employee.getName());
            dbirthXDatePicker.setDate(employee.getDateOfBirth());
            addressTextField.setText(employee.getAddress());
            phoneTextField.setText(employee.getPhoneNumber());        
            Employee e=(Employee)employee;
            eExtensionTextField.setText(e.getPhoneExtensionNumber()+"");
            eRoleTextField.setText(e.getRole());
            eUsernameTextField.setText(e.getRole());
            ePasswordTextField.setText(e.getPassword());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // reset button resets everything and empty the id field for new entry
        idTextField.setText("");
        sPanel.setVisible(false);
        employeePanel.setVisible(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // can be used only after search button
        if(idTextField.getText().length()<=0||NameTextField.getText().length()<=0
                ||eExtensionTextField.getText().length()<=0)
        {
            JOptionPane.showMessageDialog(null, "Please enter Employee ID");
        }else
        {
        String id=idTextField.getText();
        //potentillay current search employee function can be available only to admin staff
        Employee employee=Dashboard.staff.searchEmployee(id, Dashboard.shop);
        sPanel.setVisible(true);
        employeePanel.setVisible(true);
        //fields, which can be changed.
        employee.setName(NameTextField.getText());
        employee.setAddress(addressTextField.getText());
        employee.setId(idTextField.getText());
        employee.setPhoneNumber(phoneTextField.getText());
        employee.setUsername(eUsernameTextField.getText());
        employee.setPassword(ePasswordTextField.getText());
        employee.setRole(eRoleTextField.getText());
        employee.setPhoneExtensionNumber(Integer.parseInt(eExtensionTextField.getText()));
        JOptionPane.showMessageDialog(this, "Employee updated sucesfully");
        sPanel.setVisible(false);
        employeePanel.setVisible(false);
        idTextField.setText("");       
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void dbirthXDatePickerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dbirthXDatePickerPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dbirthXDatePickerPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel aBuilderLabel1;
    private javax.swing.JLabel aColourLabel1;
    private javax.swing.JLabel aHeightLabel4;
    private javax.swing.JLabel aHeightLabel5;
    private javax.swing.JLabel aLengthLabel3;
    private javax.swing.JLabel aModelLabel1;
    private javax.swing.JLabel aSerialLabel1;
    private javax.swing.JLabel aWidthLabel5;
    private javax.swing.JLabel aYearLabel1;
    private javax.swing.JTextField addressTextField;
    private com.toedter.calendar.JDateChooser dbirthXDatePicker;
    private javax.swing.JTextField eExtensionTextField;
    private javax.swing.JTextField ePasswordTextField;
    private javax.swing.JTextField eRoleTextField;
    private javax.swing.JTextField eUsernameTextField;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel sPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}