/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import Helpers.R2SL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



/**
 *
 * @author Lei
 */
public class Core extends database implements Blueprint{

    private String table;
    private String whereValues;
    private Boolean where = false;
    private ResultSet rs;
    
    public Core() {
    }

    public Boolean getWhere() {
        return where;
    }

    public void setWhere(Boolean where) {
        this.where = where;
    }

    public void setWhereValues(String whereValues) {
        this.whereValues = whereValues;
    }
    
    public void setWhereValues(String[][] values) {
        for(int i = 0; i < values.length; i++){
            if(i == values.length){
                
            }
        }
    }

    
    public String getWhereValues() {
        return whereValues;
    }

    
    
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Core(String table){
        this.table = table;
        this.initCon();
    }
    
    public Core(String table, Boolean where) {
        this.table = table;
        this.where = where;
        this.initCon();
    }

    private void initCon(){
        this.startConnection();
    }
    
    
    @Override
    public List get() {
        try {
        
            Statement stmt = this.getConnection().createStatement();
            
            if(this.hasConnection()){
                if(this.where) {
                   this.rs = stmt.executeQuery("SELECT * FROM " + this.table + " " + this.whereValues );
                }else {
                   this.rs = stmt.executeQuery("SELECT * FROM " + this.table);
                }
            }
        
            return R2SL.convert(this.rs);
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

        
    public int countRS(ResultSet rs){
        int count = 0;
        try {
            while(rs.next()){
                count++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return count;
    }

    @Override
    public Boolean insert(String... values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean insert(HashMap values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(String... values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(HashMap values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List get(String... values) {
        
        String columns = "";
        
        for(int i = 0; i < values.length; i++){
            if(i == values.length) {
                columns += values[i];
            }else{
                columns += values[i] + ", ";
            }
        }
        
        try {
            
            Statement st = this.getConnection().createStatement();
            
            if(this.hasConnection()) {
                if (this.where) {
                
                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
        return null;
    }
  
   
}
