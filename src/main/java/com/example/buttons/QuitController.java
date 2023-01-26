package com.example.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class QuitController {
    @FXML
    private Button back;

    @FXML
    private Button confirm;

    @FXML
    private Button no;

    @FXML
    void initialize(){
        back.setOnAction(event ->{
            try {
                back.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("contacts.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Contacts");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        confirm.setOnAction(event ->{
            try {
                confirm.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Register");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        no.setOnAction(event ->{
            try {
                no.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("contacts.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Register");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
