package org.fcuevas.java.fundamentos.proyectos.colegio;

public class Evaluacion {
    private static int contador;
    private int codigo;
    private double nota;
    private Asignatura asignatura;

    static{
        contador = 1;
    }

    public Evaluacion(double n, Asignatura a){
        codigo = contador++;
        nota = n;
        asignatura = a;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\tEVALUACION" +
                "(Codigo = " + codigo +
                " | Nota = " + Math.round(nota) +
                " | Asignatura = " + asignatura + ")";
    }
}
