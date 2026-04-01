module com.example.csit226 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.csit226 to javafx.fxml;
    exports com.example.csit226;
}