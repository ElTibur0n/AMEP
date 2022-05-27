package dev.yuafox.testfx.controller;

import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class GuiManager {

    public static GuiManager instance = new GuiManager();
    private final Map<String, GuiController> guis;
    private Stage stage;

    private GuiManager(){
        this.guis = new HashMap<>();
    }

    public void addScene(String id, GuiController controller){
        this.guis.put(id, controller);
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public void openScene(String id){
        this.stage.setScene(this.guis.get(id).getScene());
        this.stage.show();
    }
}
