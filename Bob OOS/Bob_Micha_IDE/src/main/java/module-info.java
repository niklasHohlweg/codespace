module com.dev.nho.bob_micha_ide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.dev.nho.bob_micha_ide to javafx.fxml;
    exports com.dev.nho.bob_micha_ide;
}