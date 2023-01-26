package com.example.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    private String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 5;");
    private String successStyle = String.format("-fx-border-color: GREEN; -fx-border-width: 2; -fx-border-radius: 5;");
    @FXML
    private Button login;

    @FXML
    private Button register;

    @FXML
    private TextField t1;

    @FXML
    private PasswordField t2;
    @FXML
    void initialize(){
        login.setOnAction(event ->{
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
                if (fail == 0) {
                    login.getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("contacts.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 318, 488);
                    Stage stage = new Stage();
                    stage.setTitle("Contacts");
                    stage.setScene(scene);
                    stage.show();
                }
                fail = 0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        register.setOnAction(event ->{
            try {
                register.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
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
