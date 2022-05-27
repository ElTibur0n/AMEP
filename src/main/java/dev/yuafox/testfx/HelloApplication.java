package dev.yuafox.testfx;

import dev.yuafox.testfx.controller.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello!");

        GuiManager.instance.setStage(stage);

        org.kordamp.bootstrapfx.BootstrapFX.bootstrapFXStylesheet();

        GuiManager.instance.addScene("inicio", new GuiInicio());
        GuiManager.instance.addScene("addEnigma", new GuiAddEnigma());
        GuiManager.instance.addScene("addMostrador", new GuiAddMostrador());
        GuiManager.instance.addScene("addRetoMostrador", new GuiAddRetoMostrador());
        GuiManager.instance.addScene("loginLlull", new GuiLoginLlull());
        GuiManager.instance.addScene("nuevaTirada", new GuiNuevaTirada());
        GuiManager.instance.addScene("resolverMostrador", new GuiResolverMostrador());
        GuiManager.instance.addScene("resolverMostradorSeleccionado", new GuiResolverMostradorSeleccionado());

        GuiManager.instance.openScene("inicio");
    }

    public static void main(String[] args) {
        launch();
    }
}