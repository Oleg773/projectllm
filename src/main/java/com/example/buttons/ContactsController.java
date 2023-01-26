package com.example.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactsController {
    @FXML
    private Button quit;
    @FXML
    private Button mes1;
    @FXML
    private Button mes2;
    @FXML
    private Button mes3;
    @FXML
    private Button mes4;
    @FXML
    private Button mes5;

    @FXML
    void initialize(){
        quit.setOnAction(event ->{
            try {
                quit.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("confirmQuit.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mes1.setOnAction(event ->{
            try {
                mes1.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("messages.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mes5.setOnAction(event ->{
            try {
                mes5.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("messages.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mes4.setOnAction(event ->{
            try {
                mes4.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("messages.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mes3.setOnAction(event ->{
            try {
                mes3.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("messages.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mes2.setOnAction(event ->{
            try {
                mes2.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("messages.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Confirm");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
