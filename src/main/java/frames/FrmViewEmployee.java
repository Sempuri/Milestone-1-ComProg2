/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import classes.EmployeeAttendance;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DREAM PC
 */
public class FrmViewEmployee extends javax.swing.JDialog {

    /**
     * Creates new form FrmViewEmployee
     */
    
    public FrmViewEmployee(String EmployeeNo, String LastName, String FirstName) {
        setModalityType(ModalityType.APPLICATION_MODAL);
        initComponents(); //important that this will be declared first to enable lines of code after
        txtEmployeeNo.setText(EmployeeNo);
        txtLastName.setText(LastName);
        txtFirstName.setText(FirstName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeNo = new javax.swing.JLabel();
        txtEmployeeNo = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        btnViewAttendance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeAttendance = new javax.swing.JTable();
        lblTotalHoursWorked = new javax.swing.JLabel();
        txtTotalHoursWorked = new javax.swing.JTextField();
        lblGrossMonthlySalary = new javax.swing.JLabel();
        txtGrossMonthlySalary = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        lblHrs = new javax.swing.JLabel();
        lblPesos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ClearTable(evt);
            }
        });

        lblEmployeeNo.setText("Employee No.:");

        txtEmployeeNo.setEditable(false);

        lblLastName.setText("Last Name:");

        txtLastName.setEditable(false);

        lblFirstName.setText("First Name:");

        txtFirstName.setEditable(false);

        lblMonth.setText("Month:");

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "September", "October", "November", "December" }));

        btnViewAttendance.setText("View Attendance");
        btnViewAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadEmployeeAttendance(evt);
            }
        });

        tblEmployeeAttendance.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEmployeeAttendance);

        lblTotalHoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalHoursWorked.setText("Total Hours Worked:");

        txtTotalHoursWorked.setEditable(false);
        txtTotalHoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblGrossMonthlySalary.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGrossMonthlySalary.setText("Gross Monthly Salary:");

        txtGrossMonthlySalary.setEditable(false);
        txtGrossMonthlySalary.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closewindow(evt);
            }
        });

        lblHrs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHrs.setText("Hrs");

        lblPesos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPesos.setText("Pesos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClose)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeNo)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName)
                            .addComponent(lblMonth))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnViewAttendance)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmployeeNo)
                                    .addComponent(txtLastName)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrossMonthlySalary)
                            .addComponent(lblTotalHoursWorked))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTotalHoursWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHrs))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGrossMonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPesos)))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeNo)
                    .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMonth)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalHoursWorked)
                            .addComponent(txtTotalHoursWorked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHrs))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrossMonthlySalary)
                            .addComponent(txtGrossMonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesos))))
                .addGap(28, 28, 28)
                .addComponent(btnViewAttendance)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Event Handler Method for View Attendance Button
    private void LoadEmployeeAttendance(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadEmployeeAttendance
        EmployeeAttendance _attendance = new EmployeeAttendance();
        try {
            tblEmployeeAttendance.setModel(_attendance.GetEmployeeAttendance(txtEmployeeNo.getText(), cmbMonth.getSelectedItem().toString()));
            txtTotalHoursWorked.setText(String.valueOf(_attendance.GetTotalHours()));
            txtGrossMonthlySalary.setText(String.valueOf(_attendance.GetPayrollSalary()));
 
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(FrmViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoadEmployeeAttendance

    //Event Handler Method for Close Button
    private void closewindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closewindow
        this.dispose();
    }//GEN-LAST:event_closewindow

    //Event Handler Method for clearing the table when opening the View Employee Frame
    private void ClearTable(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ClearTable
        tblEmployeeAttendance.setModel(new DefaultTableModel());
    }//GEN-LAST:event_ClearTable


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnViewAttendance;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeNo;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGrossMonthlySalary;
    private javax.swing.JLabel lblHrs;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblPesos;
    private javax.swing.JLabel lblTotalHoursWorked;
    private javax.swing.JTable tblEmployeeAttendance;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGrossMonthlySalary;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtTotalHoursWorked;
    // End of variables declaration//GEN-END:variables
}