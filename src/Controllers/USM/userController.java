/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.USM;

import Model.*;
import java.util.List;

/**
 *
 * @author Lei
 */
public class userController {
    
    
    public List getAll(){
        return new Users().get();
    }
    
    public List get(String... values){
        return new Users().get(values);
        
    }
    
}
