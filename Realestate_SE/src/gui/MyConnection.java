/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


/**
 *
 * @author azerty
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection {
    
    
    
     String url="jdbc:mysql://localhost:3306/ds";
    String login="root";
    String password="";

   
    private static Connection instance;
    
    private MyConnection() {
         try {
             instance=DriverManager.getConnection(url, login, password);
             System.out.println("connection deja etablie");
         } catch (SQLException ex) {
             Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    
    }
    
    
    public static Connection getInstance(){
        if (instance==null)
            new MyConnection();
        return instance;
    
    }
    
}
