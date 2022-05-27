package dev.yuafox.testfx.logic;

public class Acumulado {

    private int positiva;
    private int negativa;

    private final Reto reto;

    public Acumulado(Reto reto){
        this.positiva = 0;
        this.negativa = 0;
        this.reto = reto;
    }

    public int getPositiva() {
        return positiva;
    }

    public void setPositiva(int positiva) {
        this.positiva = positiva;
    }

    public int getNegativa() {
        return negativa;
    }

    public void setNegativa(int negativa) {
        this.negativa = negativa;
    }

    public Reto getReto() {
        return reto;
    }
}
