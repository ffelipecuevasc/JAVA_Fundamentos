package org.fcuevas.java.fundamentos.proyectos.colegio;

public class Asignatura {
    private String nombre;

    public Asignatura(String nom){
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
