module bsu.comp152.windowwebdata {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires com.google.gson;

    opens bsu.comp152.windowwebdata to javafx.fxml, com.google.gson;
    exports bsu.comp152.windowwebdata;
}