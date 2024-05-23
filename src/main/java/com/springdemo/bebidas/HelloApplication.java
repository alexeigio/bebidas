package com.springdemo.bebidas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    String tamano = "";
    String sabor = "";
    boolean hielo = false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Bebidas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public String seleccionarTamano(String seleccion) {
        tamano = seleccion;
        return "";
    }

    public String seleccionarSabor(String seleccion) {
        sabor = seleccion;
        return "";
    }

    public boolean seleccionarHielo(boolean seleccion) {
        if (seleccion) {
            this.hielo = true;
            return true;
        } else {
            this.hielo = false;
            return false;
        }
    }

    public static void cerrar(Scene scene) {
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }
}