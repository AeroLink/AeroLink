/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Helpers.AlertResponse;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ProgressBar;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Lei
 */
public class SplashScreenController implements Initializable {

    Controllers.SplashScreen cc = new Controllers.SplashScreen();
    
    public Boolean passed = false;
    public Thread th;
    
    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public Boolean getPassed() {
        return passed;
    }
    
    
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
       th = new Thread(new Runnable(){
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
                           JOptionPane.showMessageDialog(null, "Error while connecting to database");
                           System.exit(0);
                       }
                   }
                   
                   LoadingBar.setProgress(prog += .01);
               }
               
              PassedLogin();
           }
       
       });
       
       th.start();
       
    }
    
    public void PassedLogin(){
       Platform.runLater(new Runnable(){
           @Override
           public void run() {
                Helpers.Form.close(LoadingBar);
        new Helpers.Form("/FXMLS/Login.fxml").open(StageStyle.UNDECORATED);
           }
       
       });
    }
}
