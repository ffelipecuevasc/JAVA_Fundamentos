package org.fcuevas.java.fundamentos.proyectos.colegio;

import java.util.Arrays;

public class Alumno {
    private String run, nombre, situacionFinal;
    private int edad, asistencia;
    private Evaluacion[] evaluaciones;

    public Alumno(){
        evaluaciones = new Evaluacion[3];
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String getRun() {
        return run;
    }

    public Evaluacion[] getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Evaluacion[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSituacionFinal() {
        setSituacionFinal();
        return situacionFinal;
    }

    public void setSituacionFinal() {
        boolean existe = false;
        if(evaluaciones != null) existe = true;
        if(existe){
            double acumulador = 0;
            for(int i=0;i<evaluaciones.length;i++) acumulador += (evaluaciones[i].getNota());
            double promedio = acumulador/3;
            situacionFinal = (promedio >= 4.0 && asistencia > 60) ? "Aprobado" : "Reprobado";
        }else{
            situacionFinal = "No calculada";
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n\t\tALUMNO" +
                "\n\t\t\t- RUN = " + getRun() +
                "\n\t\t\t- Nombre = " + getNombre() +
                "\n\t\t\t- Situacion Final = " + getSituacionFinal() +
                "\n\t\t\t- Edad = " + getEdad() +
                "\n\t\t\t- Asistencia = " + getAsistencia() +
                "\n\t\t\t- Evaluaciones =" + Arrays.toString(evaluaciones);
    }
}
