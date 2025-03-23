package org.fcuevas.java.fundamentos.poo.herencia.interfaces;

public abstract class Hoja {
    protected String contenido;

    public Hoja(String contenido){
        this.contenido = contenido;
    }

    public abstract String imprimir();
}
