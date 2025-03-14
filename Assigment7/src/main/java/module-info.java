module org.example.assigment7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assigment7 to javafx.fxml;
    exports org.example.assigment7;
    exports org.example.assigment7.controller;
    opens org.example.assigment7.controller to javafx.fxml;
}