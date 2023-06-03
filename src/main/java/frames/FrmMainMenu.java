/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes.Employee;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DREAM PC
 */
public class FrmMainMenu extends javax.swing.JDialog {

    /**
     * Creates new form FrmMainMenu
     */
    public FrmMainMenu() {
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddEmployee = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnViewEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                LoadEmployees(evt);
            }
        });

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployee(evt);
            }
        });

        btnUpdateEmployee.setText("Update Employee");
        btnUpdateEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateEmployee(evt);
            }
        });

        btnDeleteEmployee.setText("Delete Employee");
        btnDeleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEmployee(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        btnViewEmployee.setText("View Employee Record");
        btnViewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewEmployee(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAddEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Event Handler Method for Add Employee button
    private void AddEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployee
        FrmNewEmployee _addEmployee = new FrmNewEmployee();
        _addEmployee.pack();
        _addEmployee.setVisible(true);
        String csvFilename = "Employees.csv";
        Employee _employee = new Employee();
        try {
            tblEmployee.setModel(_employee.FetchEmployees(csvFilename));
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddEmployee
    //Event Handler Method to show the employee records inside the table as soon as the window is opened
    private void LoadEmployees(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadEmployees
         String csvFilename = "Employees.csv";
        Employee _employee = new Employee();
        try {
            tblEmployee.setModel(_employee.FetchEmployees(csvFilename));
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoadEmployees
    
    //Event Handler Method for Update Employee button
    private void UpdateEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateEmployee
        Employee _employee = new Employee();
        _employee.SetEmployeeNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 0).toString());
        _employee.SetLastName(tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 1).toString());
        _employee.SetFirstName(tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 2).toString());
        _employee.SetSSSNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 3).toString());
        _employee.SetPhealthNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 4).toString());
        _employee.SetTinNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 5).toString());
        _employee.SetPagibigNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 6).toString());
        FrmEditEmployee _editEmployee = new FrmEditEmployee(_employee);
        _editEmployee.pack();
        _editEmployee.setVisible(true);
        String csvFilename = "Employees.csv"; //para mag update din yung table pag inedit yung employee records
        try {
            tblEmployee.setModel(_employee.FetchEmployees(csvFilename));
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateEmployee

    //Event Handler Method for Delete Employee Button
    private void DeleteEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEmployee
        Employee _employee = new Employee();
        _employee.SetEmployeeNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 0).toString());
        _employee.SetLastName(tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 1).toString());
        _employee.SetFirstName(tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 2).toString());
        _employee.SetSSSNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 3).toString());
        _employee.SetPhealthNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 4).toString());
        _employee.SetTinNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 5).toString());
        _employee.SetPagibigNo(tblEmployee.getModel().getValueAt (tblEmployee.getSelectedRow(), 6).toString());
        FrmDeleteEmployee _delete = new FrmDeleteEmployee(_employee);
        _delete.setVisible(true);
         String csvFilename = "Employees.csv"; //para mag update din yung table pag inedit yung employee records
        try {
            tblEmployee.setModel(_employee.FetchEmployees(csvFilename));
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.INFO, "An unexpected error occured.", ex);
        }
    }//GEN-LAST:event_DeleteEmployee

    //Event Handler Method for View Employee Record Button
    private void ViewEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewEmployee
        String _selectedEmployeeNo = tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 0).toString();
        String _selectedLastName = tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 1).toString();
        String _selectedFirstName = tblEmployee.getModel().getValueAt(tblEmployee.getSelectedRow(), 2).toString();
        FrmViewEmployee _view = new FrmViewEmployee(_selectedEmployeeNo, _selectedLastName, _selectedFirstName);
        _view.setVisible(true);
    }//GEN-LAST:event_ViewEmployee

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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JButton btnViewEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables
}
