module com.example.java_seminar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_seminar to javafx.fxml;
    exports com.example.java_seminar;
}