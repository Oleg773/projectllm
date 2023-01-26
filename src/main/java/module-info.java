module com.example.buttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttons to javafx.fxml;
    exports com.example.buttons;
}