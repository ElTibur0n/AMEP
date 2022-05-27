package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Enigma {

    private final String nombreEnigma;
    private final String enunciado;
    private int numRetoEnigma;
    private final List<Respuesta> componente;

    public Enigma(String nombreEnigma, String enunciado){
        this.nombreEnigma = nombreEnigma;
        this.enunciado = enunciado;
        this.numRetoEnigma = 0;
        this.componente = new ArrayList<>();
    }

    public int getNumRetoEnigma() {
        return numRetoEnigma;
    }

    public void setNumRetoEnigma(int numRetoEnigma) {
        this.numRetoEnigma = numRetoEnigma;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getNombreEnigma() {
        return nombreEnigma;
    }

    public List<Respuesta> getComponente() {
        return componente;
    }
}
