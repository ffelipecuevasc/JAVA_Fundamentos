package org.fcuevas.java.fundamentos.poo.herencia.fundamentos;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        super();
        asignatura = null;
    }

    public Profesor(String asignatura){
        this();
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        return "Hola! Soy una persona, específicamente un profesor.";
    }
}
