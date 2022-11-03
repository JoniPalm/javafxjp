module com.thejp.javafxjp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thejp.javafxjp to javafx.fxml;
    exports com.thejp.javafxjp;
}