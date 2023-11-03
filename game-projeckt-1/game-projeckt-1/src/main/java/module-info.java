module by.polez.gameprojeckt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens by.polez.gameprojeckt1 to javafx.fxml;
    exports by.polez.gameprojeckt1;
}