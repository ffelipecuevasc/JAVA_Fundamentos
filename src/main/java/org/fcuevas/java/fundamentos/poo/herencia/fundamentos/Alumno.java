package org.fcuevas.java.fundamentos.poo.herencia.fundamentos;

public class Alumno extends Persona{
    protected String institucion;
    protected Double nota1, nota2, nota3;

    public Alumno(){
        super();
        institucion = null;
        nota1 = null;
        nota2 = null;
        nota3 = null;
    }

    public Alumno(String institucion, Double nota1, Double nota2, Double nota3){
        this();
        this.institucion = institucion;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String saludar(){
        return "Hola! Soy una persona, específicamente un alumno.";
    }
}
