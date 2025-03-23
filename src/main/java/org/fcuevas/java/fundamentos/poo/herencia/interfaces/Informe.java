package org.fcuevas.java.fundamentos.poo.herencia.interfaces;

public class Informe extends Hoja implements Imprimible {
    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por '" + this.autor
                + "' y revisado por '" + this.revisor
                + "'. \nContenido: " + this.contenido;
    }
}
