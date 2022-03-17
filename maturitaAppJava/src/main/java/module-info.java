module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires okhttp3;
    requires org.json;

    opens com.example to javafx.fxml;
    exports com.example;
}
