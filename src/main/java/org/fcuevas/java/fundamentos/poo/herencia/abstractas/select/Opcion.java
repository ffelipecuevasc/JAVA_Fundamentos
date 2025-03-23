package org.fcuevas.java.fundamentos.poo.herencia.abstractas.select;

public class Opcion {
    private String nombre, valor;
    private Boolean selected;

    public Opcion() {
    }

    public Opcion(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.selected = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean isSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
