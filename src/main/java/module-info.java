module com.example.dashb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.dashb to javafx.fxml;
    exports com.example.dashb;
}