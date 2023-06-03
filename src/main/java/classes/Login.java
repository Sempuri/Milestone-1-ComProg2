/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DREAM PC
 */
public class Login {
    private String _username;
    private String _password;
    
    //Setter Method; No Getter Method for class Login as it's only purpose is to validate given login credentials
    //no agenda for getting values for username and password out of Login class
    public void SetUsername (String Username) {
        _username = Username;
    }
    public void SetPassword(char[] Password) {
        _password = new String(Password); //array of char Password converted to String for it to be assigned to a String variable
    }
    
    //Method for Login Authentication
    public boolean IsAuthenticated() throws FileNotFoundException, IOException, CsvValidationException {
        String csvFilename = "Accounts.csv";
        try(CSVReader reader = new CSVReader(new FileReader(csvFilename))) {
           String[] line;
           while((line = reader.readNext()) !=null) {
               if(line[0].equals(_username)) {
                   return line[1].equals(_password); //'.equals' is used for comparison of strings, '==' only works for numerical values
               } 
        }
        }
        return false; //means username and password are not authenticated
    }
}
