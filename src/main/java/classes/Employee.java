/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package classes;

/**
 *
 * @author DREAM PC
 */

/**
 * IMPORT CLASSES
 * This section contains the external classes used to Create, Read, Update and Delete Employee Records
 */

import java.io.FileWriter;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class Employee {
    
    //Attributes
    private String _employeeNo;
    private String _lastName;
    private String _firstName;
    private String _sssNo;
    private String _phealthNo;
    private String _tinNo;
    private String _pagibigNo;
    
    //GETTER METHODS
    public String GetEmployeeNo(){
        return _employeeNo;
    } 
    public String GetLastName(){
        return _lastName;
    } 
    public String GetFirstName(){
        return _firstName;
    } 
    public String GetSSSNo(){
        return _sssNo;
    } 
    public String GetPhealthNo(){
        return _phealthNo;
    } 
    public String GetTinNo(){
        return _tinNo;
    } 
    public String GetPagibigNo(){
        return _pagibigNo;
    } 
    
    //SETTER METHODS
    public void SetEmployeeNo(String EmployeeNo) {
        _employeeNo = EmployeeNo;
        }
    public void SetLastName(String LastName) {
        _lastName = LastName;
        }
    public void SetFirstName(String FirstName) {
        _firstName = FirstName;
        }
    public void SetSSSNo(String SSSNo) {
        _sssNo = SSSNo;
        }
    public void SetPhealthNo(String PhealthNo) {
        _phealthNo = PhealthNo;
        }
    public void SetTinNo(String TinNo) {
        _tinNo = TinNo;
        }
    public void SetPagibigNo(String PagibigNo) {
        _pagibigNo = PagibigNo;
        }
    
    //Method for creating Employee File; this works when 'Employees.csv' does not exist
    public void CreateEmployeeFile(String CSVFilename) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] headers = new String [7];
            headers[0] = "employee_number";
            headers[1] = "lastname";
            headers[2] = "firstname";
            headers[3] = "sss_number";
            headers[4] = "philhealth_number";
            headers[5] = "tin_number";
            headers[6] = "pagibig_number";
            writer.writeNext(headers);
        }
    }
    
    //Method for adding or writing employee record in the csv file
    public void AddEmployee(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] employeeRecord = new String[7];
            employeeRecord[0] = _employeeNo;
            employeeRecord[1] = _lastName;
            employeeRecord[2] = _firstName;
            employeeRecord[3] = _sssNo;
            employeeRecord[4] = _phealthNo;
            employeeRecord[5] = _tinNo;
            employeeRecord[6] = _pagibigNo;
            writer.writeNext(employeeRecord);
        }
    }
    
    //Method for fetching Employee records from the CSV file to a default table model
    public DefaultTableModel FetchEmployees (String CSVFilename) throws IOException, CsvValidationException {
        DefaultTableModel _employees;
        try(CSVReader reader = new CSVReader (new FileReader (CSVFilename))) {
            String[] header = reader.readNext();
            _employees = new DefaultTableModel(header,0);
            String[] line; //assigned to fetch the values from the CSV file
            while((line = reader.readNext()) !=null){
                _employees.addRow(line);
            }
        }
        return _employees;
    }
    
    //Method for Editing Employee Records
    public void EditEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv",".tmp"); //from csv to tmp
        CSVReader reader = new CSVReader(new FileReader(CSVFilename)); //for the reader, the file that will be accessed would be Employees.csv
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))) { //for the writer, the file that will be created would be Employees.tmp
            while((line = reader.readNext()) !=null) {
                if(line[0].equals(_employeeNo)) {
                    line[0] = _employeeNo;
                    line[1] = _lastName;
                    line[2] = _firstName;
                    line[3] = _sssNo;
                    line[4] = _phealthNo;
                    line[5] = _tinNo;
                    line[6] = _pagibigNo;
                }
                writer.writeNext(line);
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    //Method for Deleting Employee Record
    public void DeleteEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv",".tmp"); //from csv to tmp
        CSVReader reader = new CSVReader(new FileReader(CSVFilename)); //for the reader, the file that will be accessed would be Employees.csv
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))) { //for the writer, the file that will be created would be Employees.tmp
            while((line = reader.readNext()) !=null) {
                if(!line[0].equals(_employeeNo)) {
                    writer.writeNext(line);
                }
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
}

