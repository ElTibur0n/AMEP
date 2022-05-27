package dev.yuafox.testfx.controller;


import dev.yuafox.testfx.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class GuiResolverMostradorSeleccionado implements GuiController {

    @Override
    public Scene getScene(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("resolverMostradorSeleccionado.fxml"));
        fxmlLoader.setController(this);
        try {
            return new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
