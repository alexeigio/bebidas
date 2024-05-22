module com.springdemo.bebidas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.springdemo.bebidas to javafx.fxml;
    exports com.springdemo.bebidas;
}