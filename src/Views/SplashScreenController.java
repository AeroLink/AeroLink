/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Lei
 */
public class SplashScreenController implements Initializable {

    Controllers.SplashScreen cc = new Controllers.SplashScreen();
            
    @FXML
    private ProgressBar LoadingBar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tick();
    }    
    
   
    
    //Async Block
    public void tick(){
       new Thread(new Runnable(){
           @Override
           public void run() {
               Double prog  = .01;
               while(LoadingBar.progressProperty().floatValue() != 1f ) {
                   try {
                       Thread.sleep(50);
                   } catch (InterruptedException ex) {
                       
                   }
                   
                   if(LoadingBar.progressProperty().floatValue() == 0.5f ) {
                       if (!cc.checkCon()){
                        System.out.println("err");
                       }
                   }
                   
                   LoadingBar.setProgress(prog += .01);
               }
           }
       
       }).start(); 
       
    }
}