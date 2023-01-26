package com.example.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    private String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 5;");
    private String successStyle = String.format("-fx-border-color: GREEN; -fx-border-width: 2; -fx-border-radius: 5;");
    @FXML
    private Button r;

    @FXML
    private Button l;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private PasswordField p1;
    @FXML
    private PasswordField p2;

    @FXML
    void initialize(){
        r.setOnAction(event ->{
            try {
                int fail = 0;
                if (t1.getText().compareTo("") == 0) {
                    ++fail;
                    t1.setStyle(errorStyle);
                }
                else {
                    t1.setStyle(successStyle);
                }
                if (t2.getText().compareTo("") == 0) {
                    ++fail;
                    t2.setStyle(errorStyle);
                }
                else {
                    t2.setStyle(successStyle);
                }
                if (p1.getText().compareTo("") == 0) {
                    ++fail;
                    p1.setStyle(errorStyle);
                }
                else {
                    p1.setStyle(successStyle);
                }
                if (p2.getText().compareTo("") == 0) {
                    ++fail;
                    p2.setStyle(errorStyle);
                }
                else {
                    p2.setStyle(successStyle);
                }
                if (fail==0) {
                    r.getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("confirm.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                    Stage stage = new Stage();
                    stage.setTitle("Confirm");
                    stage.setScene(scene);
                    stage.show();
                }
                fail = 0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        l.setOnAction(event ->{
            try {
                l.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                Stage stage = new Stage();
                stage.setTitle("Login");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

