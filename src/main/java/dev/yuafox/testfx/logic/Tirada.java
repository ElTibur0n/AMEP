package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.List;

public class Tirada {

    private int tabaPositiva;
    private int tabaNegativa;
    private final List<Respuesta> seleccionado;

    private final Reto reto;

    public Tirada(Reto reto){
        this.tabaNegativa = 0;
        this.tabaPositiva = 0;
        this.reto = reto;
        this.seleccionado = new ArrayList<>();
    }

    public int getTabaPositiva() {
        return tabaPositiva;
    }

    public void setTabaPositiva(int tabaPositiva) {
        this.tabaPositiva = tabaPositiva;
    }

    public int getTabaNegativa() {
        return tabaNegativa;
    }

    public void setTabaNegativa(int tabaNegativa) {
        this.tabaNegativa = tabaNegativa;
    }

    public List<Respuesta> getSeleccionado() {
        return seleccionado;
    }
}
