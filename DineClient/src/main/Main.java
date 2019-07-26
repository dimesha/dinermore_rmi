/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dimesha
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
       
        Parent root=FXMLLoader.load(getClass().getResource("/views/TelOrder.fxml"));
        Scene mainScene = new Scene(root);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Dine");
        primaryStage.setResizable(false);

        primaryStage.centerOnScreen();
        primaryStage.show();
    }

}
