/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Harshit Goyal
 */
public class dbConnection {
    public static Connection conn() throws ClassNotFoundException{
        Connection conn = null;
        try{
            /////// Xammp File //////////////////
            Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory control system","root","");
            //JOptionPane.showMessageDialog(null, "Database Connected");
            
            /////////////// SQLite3 Database JDBC Connectivity
            //Class.forName("org.sqlite.JDBC");
            //conn = DriverManager.getConnection("jdbc:sqlite:icsv.db");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return conn;
    }
}
