package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private final List<Tirada> tiradas;
    private final Llull dosis;

    public Juego(Llull llull){
        this.tiradas = new ArrayList<>();
        this.dosis = llull;
    }

    public Juego(){
        this.tiradas = new ArrayList<>();
        this.dosis = null;
    }
}
