module org.example.assigment6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assigment6 to javafx.fxml;
    exports org.example.assigment6;
}