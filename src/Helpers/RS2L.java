/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lei
 */
public class RS2L {
    
    
    public static List convert(ResultSet rs, int size){
        
        ArrayList list = new ArrayList(size);
        
        try {
            
            ResultSetMetaData md  = rs.getMetaData();
            int columns = md.getColumnCount();
            
            while(rs.next()) {
                HashMap row = new HashMap(columns);
                for(int i = 0; i < columns; ++i){
                
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return list;
                
    }
    
    
}
