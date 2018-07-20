/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Lei
 */
public class Model implements Blueprint{
    
    private String[] columns;
    private String table;
    protected Core core;
    
    
    public Model() {
    }

    public Model(String[] columns, String table) {
        this.columns = columns;
        this.table = table;
    }

    @Override
    public List get() {
      this.core.table = this.table;
      return null;
    }

    @Override
    public Boolean insert(String... values) {
        return false;
    }

    @Override
    public Boolean insert(HashMap values) {
        return false;
    }

    @Override
    public Boolean update(String... values) {
        return false;
    }

    @Override
    public Boolean update(HashMap values) {
        return false;
    }

    
   
   
}
