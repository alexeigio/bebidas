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
            System.out.println("jamaica");
        } else if (actionEvent.getSource() == btnLimon) {
            System.out.println("limon");
        } else if (actionEvent.getSource() == btnHorchata) {
            System.out.println("horchata");
        }
    }

    public void onTamanoSeleccionButtonClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnChico) {
            System.out.println("chico");
        } else if (actionEvent.getSource() == btnMediano) {
            System.out.println("mediano");
        } else if (actionEvent.getSource() == btnGrande) {
            System.out.println("grande");
        }
    }

    public void onHieloSeleccionButtonClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnHieloSi) {
            System.out.println("con hielo");
        } else if (actionEvent.getSource() == btnHieloNo) {
            System.out.println("sin hielo");
        }
    }
}