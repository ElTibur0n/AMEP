package dev.yuafox.testfx.logic;

import java.util.UUID;

public class Respuesta {

    private final UUID idRespuesta;
    private final String texto;
    private final TipoRespuesta tipoRespuesta;



    public Respuesta(String texto, TipoRespuesta tipoRespuesta){
        this.idRespuesta = UUID.randomUUID();
        this.texto = texto;
        this.tipoRespuesta = tipoRespuesta;
    }

    public UUID getIdRespuesta() {
        return idRespuesta;
    }
    public String getTexto(){ return this.texto; }
    public TipoRespuesta getTipoRespuesta(){ return this.tipoRespuesta; }
}
