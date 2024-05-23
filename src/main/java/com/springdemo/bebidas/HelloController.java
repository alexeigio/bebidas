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
}