module com.thejp.javafxjp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thejp.javafxjp to javafx.fxml;
    exports com.thejp.javafxjp;
    exports com.thejp.javafxjp.model;
    opens com.thejp.javafxjp.model to javafx.fxml;
    exports com.thejp.javafxjp.controller;
    opens com.thejp.javafxjp.controller to javafx.fxml;
}