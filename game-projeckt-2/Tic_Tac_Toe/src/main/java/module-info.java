module by.polez.tic_tac_toe {
    requires javafx.controls;
    requires javafx.fxml;


    opens by.polez.tic_tac_toe to javafx.fxml;
    exports by.polez.tic_tac_toe;
}