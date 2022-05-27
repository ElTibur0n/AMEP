package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.List;

public class Llull {

    private final String nombreLlull;

    private final List<Acumulado> suspensos;

    private final List<Acumulado> acumulados;

    public Llull(String nombreLlull){
        this.nombreLlull = nombreLlull;
        this.acumulados = new ArrayList<>();
        this.suspensos = new ArrayList<>();
    }
}
