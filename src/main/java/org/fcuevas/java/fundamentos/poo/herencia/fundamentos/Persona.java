package org.fcuevas.java.fundamentos.poo.herencia.fundamentos;

public class Persona {
    protected String nombre, apellido, correoE;
    protected Integer edad;

    public Persona(){
        nombre = null;
        apellido = null;
        correoE = null;
        edad = null;
    }

    public Persona(String nombre, String apellido, String correoE, Integer edad) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoE = correoE;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String saludar(){
        return "Hola! Soy una persona.";
    }
}
