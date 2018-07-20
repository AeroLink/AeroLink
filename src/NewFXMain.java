/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.USM.permissionController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Lei
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        new permissionController().getAll();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
