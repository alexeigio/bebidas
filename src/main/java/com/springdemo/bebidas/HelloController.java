package com.springdemo.bebidas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button btnCerrar, btnChico, btnMediano, btnGrande, btnJamaica, btnLimon, btnHorchata, btnHieloSi, btnHieloNo;

    @FXML
    public void btnCerrarButtonClick() {
        HelloApplication.cerrar(btnCerrar.getScene());
    }

    public void onSaborSeleccionButtonClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnJamaica) {

        } else if (actionEvent.getSource() == btnLimon) {

        } else if (actionEvent.getSource() == btnHorchata) {

        }
    }

    public void onTamanoSeleccionButtonClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnChico) {

        } else if (actionEvent.getSource() == btnMediano) {

        } else if (actionEvent.getSource() == btnGrande) {

        }
    }

    public void onHieloSeleccionButtonClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnHieloSi) {

        } else if (actionEvent.getSource() == btnHieloNo) {

        }
    }
}