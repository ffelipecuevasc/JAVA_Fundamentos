package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public abstract class Validador {

    protected String mensaje;

    public abstract Boolean esValido(String valor);
    public abstract void setMensaje(String mensaje);
    public abstract String getMensaje();
}
