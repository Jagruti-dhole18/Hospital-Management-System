/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DatabaseConnection {
    static String url = "jdbc:mysql://localhost:3306/hospital_management_system?allowMultiqueries=true";
    static String user = "root";
    static String password = "your my-sql password";
    
    public static Connection getConnection()
    {
        try{
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Database connection is successful");
          return con;
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Database connection is failed");
           return null;
        }
    }
     public static void main(String args[])
     {
        DatabaseConnection dc = new DatabaseConnection(); 
        
     }
}
