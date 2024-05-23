package com.springdemo.bebidas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button btnCerrar, btnChico, btnMediano, btnGrande, btnJamaica, btnLimon, btnHorchata, btnHieloSi, btnHieloNo;

    @FXML
    public void btnCerrarButtonClick() {
        HelloApplication.cerrar(btnCerrar.getScene());
    }

    public void onSaborSeleccionButtonClick() {

    }

    public void onTamanoSeleccionButtonClick() {
    }

    public void onHieloSeleccionButtonClick() {
    }
}