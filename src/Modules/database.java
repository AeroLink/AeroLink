/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Config.DbClass;
/**
 *
 * @author Lei
 */
public abstract class database {

        
    public Connection CONNECTION;
    
    
    public Connection getConnection(){
        return CONNECTION;
    }
    
    public void setConnection(Connection con){
        this.CONNECTION = con;
    }
    

    
    public database() {
    }
    
    
    
    public boolean startConnection(){
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            DbClass n = new DbClass();
            com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(n.getHost() + n.getDatabase(), n.getUser(), n.getPassword());
            
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
