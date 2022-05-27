package dev.yuafox.testfx.controller;

import dev.yuafox.testfx.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class GuiAddEnigma implements GuiController {

    @Override
    public Scene getScene(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addEnigma.fxml"));
        fxmlLoader.setController(this);
        try {
            return new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
