/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Config;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 * @author Eden Ramoneda
 */
public class DbClass {
    
     public String Host = "jdbc:mysql://localhost:3306/";
    public String Database = "aerolink";
    public String User = "root";
    public String Password = "";
    
    

    public String getHost() {
        return Host;
    }

    public String getDatabase() {
        return Database;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public void setDatabase(String Database) {
        this.Database = Database;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }



    

}
