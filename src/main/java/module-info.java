module com.example.test1_lavanya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test1_lavanya to javafx.fxml;
    exports com.example.test1_lavanya;
}