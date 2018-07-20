/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lei
 */
public abstract class database {

    
    public Connection CONNECTION;
    
    private String Host = "jdbc:mysql://localhost:3306/";
    private String Database = "agun";
    private String User = "root";
    private String Password = "";
    
    public database() {
    }
    
    public Connection getConnection(){
        return CONNECTION;
    }
    
    public void setConnection(Connection con){
        this.CONNECTION = con;
    }
    
    public boolean startConnection(){
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(Host + Database, User, Password);
            
            this.setConnection(connection);
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } 
    }
    
    public boolean hasConnection(){
        try {
            return !this.CONNECTION.isClosed() || this.CONNECTION != null;
        } catch (SQLException ex) {
            return false;
        }
    }
    
}
