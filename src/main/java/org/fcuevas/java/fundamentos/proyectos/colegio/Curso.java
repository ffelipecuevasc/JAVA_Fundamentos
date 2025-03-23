package org.fcuevas.java.fundamentos.proyectos.colegio;

import java.util.Arrays;

public class Curso {
    private String nombre;
    private static int codigo;
    private static int contador;
    private Alumno[] alumnos;

    static{
        codigo = 0;
        contador = 1;
    }

    public Curso(){
        codigo++;
        alumnos = new Alumno[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Curso.contador = contador;
    }

    @Override
    public String toString() {
        return "\nCURSO" +
                "\n\t- Codigo = " + codigo +
                "\n\t- Nombre = " + nombre +
                "\n\t- Total alumnos = " + contador +
                "\n\t- Alumnos =" + Arrays.toString(alumnos);
    }
}
