package com.springdemo.bebidas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button btnCerrar;

    @FXML
    public void btnCerrarButtonClick() {
        HelloApplication.cerrar(btnCerrar.getScene());
    }

    public void onSaborSeleccionButtonClick(ActionEvent actionEvent) {
    }

    public void onTamanoSeleccionButtonClick(ActionEvent actionEvent) {
    }

    public void onHieloSeleccionButtonClick(ActionEvent actionEvent) {
    }
}