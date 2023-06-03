/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.table.DefaultTableModel;
//classes that will read the date from CSV file
import java.io.FileReader;
import com.opencsv.CSVReader;
//classes that will handle exceptions whenever file is not found, or there is an error while reading the file
import java.io.FileNotFoundException;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException; //for validation of the csv file
import java.text.DecimalFormat;

/**
 *
 * @author DREAM PC
 */
public class EmployeeAttendance {
    private static final DecimalFormat df = new DecimalFormat("0.00"); //used to convert values of totalHours and payrollSalary into two decimal places
    //Attributes
    private String _totalHoursWorked;
    private String _grossMonthlySalary;
    
    //Getter Method
    public String GetTotalHours() {
        return _totalHoursWorked;
    }
    public String GetPayrollSalary() {
        return _grossMonthlySalary;
    }
    
    //Method to load data from CSV file to default table model
    public DefaultTableModel GetEmployeeAttendance(String EmployeeNo, String Month) throws FileNotFoundException, IOException, CsvValidationException {
        DefaultTableModel _employeeAttendance;
        //instance of CSV Reader
        String CSVFilename = "EmployeeAttendance.csv";
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] header = reader.readNext();
        //instantiating of new default table model under variable _employeeAttendance
        _employeeAttendance = new DefaultTableModel(header, 0);
        //to read the record from the CSV file one by one
        String[] line;
        double totalHoursWorked = 0; //sum of number of hours per Month
        double grossMonthlySalary = 0; //total sum of the product of totalHours and hourly rate of employee
        
        while((line = reader.readNext()) !=null) {
            //to check if the employee number and month being read is equal to the given employee number and month through the program
            if (line[0].equals(EmployeeNo) && line[1].equals(Month)) {
                _employeeAttendance.addRow(line);
                grossMonthlySalary += Double.parseDouble(line[5]) * Double.parseDouble(line[6]); //number of hours * hourly rate of employee
                totalHoursWorked += Double.parseDouble(line[5]);
                
               
                                        
        }
        _totalHoursWorked = df.format(totalHoursWorked); //formatted total hours worked into 2 decimal places
        _grossMonthlySalary = df.format(grossMonthlySalary); //formatted gross monthly salary into 2 decimal places

        
    }
        return _employeeAttendance;
    }
}