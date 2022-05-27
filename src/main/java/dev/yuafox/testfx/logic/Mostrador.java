package dev.yuafox.testfx.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mostrador {

    private final String nombreMostrador;
    private final Date fechaFinal;
    private int numRetoMostrador;

    private final List<Reto> contenido;
    private final List<Juego> vivo;
    private final List<Juego> para;


    public Mostrador(String nombreMostrador, Date fechaFinal){
        this.nombreMostrador = nombreMostrador;
        this.fechaFinal = fechaFinal;
        this.contenido = new ArrayList<>();
        this.vivo = new ArrayList<>();
        this.para = new ArrayList<>();
    }

    public String getNombreMostrador() {
        return nombreMostrador;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public List<Reto> getContenido() {
        return contenido;
    }

    public List<Juego> getVivo() {
        return vivo;
    }

    public List<Juego> getPara() {
        return para;
    }
}
