package dev.yuafox.testfx.controller;

import dev.yuafox.testfx.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class GuiInicio implements GuiController {

    @Override
    public Scene getScene(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inicio.fxml"));
        fxmlLoader.setController(this);
        try {
            return new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void openGuiAddEnigma() {
        GuiManager.instance.openScene("addEnigma");
    }

    @FXML
    public void openGuiAddMostrador() {
        GuiManager.instance.openScene("addMostrador");
    }

    @FXML
    public void openGuiResolverMostrador() {
        GuiManager.instance.openScene("resolverMostrador");
    }

    @FXML
    public void openGuiLoginLlull() {
        GuiManager.instance.openScene("loginLlull");
    }

    @FXML
    public void borrarEstadistica() {
    }

}
