module org.tvc12 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.tvc12 to javafx.fxml;
    exports org.tvc12;
}