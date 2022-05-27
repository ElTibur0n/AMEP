module dev.yuafox.testfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens dev.yuafox.testfx to javafx.fxml;
    opens dev.yuafox.testfx.controller to javafx.fxml;
    exports dev.yuafox.testfx;
}