package com.example.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MessagesController {
    @FXML
    private Button back;

    @FXML
    void initialize() {
        back.setOnAction(event -> {
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
    }
}
