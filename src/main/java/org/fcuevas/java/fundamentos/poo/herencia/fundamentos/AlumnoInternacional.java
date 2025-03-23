package org.fcuevas.java.fundamentos.poo.herencia.fundamentos;

//Clase AlumnoInternacional es declarada 'final' para evitar que tenga clases hija, como String o Integer
public final class AlumnoInternacional extends Alumno{
    private String pais;
    private Double notaIdioma;

    public AlumnoInternacional(){
        super();
        pais = null;
        notaIdioma = null;
    }

    public AlumnoInternacional(String pais, Double notaIdioma){
        this();
        this.pais = pais;
        this.notaIdioma = notaIdioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(Double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }

    @Override
    public String saludar(){
        return "Hola! Soy una persona, específicamente un alumno internacional.";
    }
}
