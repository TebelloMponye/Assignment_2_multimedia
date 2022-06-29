module com.example.mponye2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mponye2 to javafx.fxml;
    exports com.example.mponye2;
}