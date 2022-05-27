package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.List;

public class Reto {

    private TipoReto tipoReto;

    private final Enigma fuente;

    private final List<Respuesta> formado;


    public Reto(Enigma enigma){
        this.fuente = enigma;
        this.formado = new ArrayList<>();
        this.tipoReto = TipoReto.NONE;
    }

    public TipoReto getTipoReto() {
        return tipoReto;
    }

    public Enigma getFuente() {
        return fuente;
    }

    public List<Respuesta> getFormado() {
        return formado;
    }

    public void definirTipo() {
        // TODO: Según el tipo de reto establecer
        this.tipoReto = TipoReto.DILEMA;
    }
}
