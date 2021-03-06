/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.util.HashMap;

/**
 *
 * @author ARIELLECIAS
 */
public class Session implements IModule {

    private static HashMap session;
    
    @Override
    public void init() {
        session  = new HashMap();
    }
    
    /**
     * 
     * Session put method - allows you to add new value inside of Session
     * 
     * Example:
     * 
     * Session s = new Session();
     * 
     * s.put("userID", "1234567890");
     * 
     * @param key  
     * @param value 
     */
    public static void put(Object key, Object value) {
       session.put(key, value);
    }
    
    public static void putIfNotExist(Object key, Object value){
        session.putIfAbsent(key, value);
    }
    
    /**
     * Session pull method - allows you to get a value
     * 
     * @param key
     * @return Object - if exist, 0 - if not
     */
    public static Object pull(Object key) {
        return session.getOrDefault(key, 0);
    }
    
    
    public static HashMap getSession() {
        return session;
    }
    
}
