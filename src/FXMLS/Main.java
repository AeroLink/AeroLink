/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLS;

import javafx.application.Application;
import javafx.stage.Stage;
import Helpers.Form;
import javafx.stage.StageStyle;

/**
 *
 * @author Lei
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       new Form("/FXMLS/SplashScreen.fxml").open(StageStyle.UNDECORATED);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
