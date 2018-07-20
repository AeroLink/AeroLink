/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Modules.database;

/**
 *
 * @author Lei
 */
public class SplashScreen extends database {
    
    
    public boolean checkCon(){
       this.startConnection();
       return this.hasConnection();
    }
}
