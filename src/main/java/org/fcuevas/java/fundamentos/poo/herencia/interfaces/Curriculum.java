package org.fcuevas.java.fundamentos.poo.herencia.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {
    private String persona, carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<String>();
    }

    public Curriculum agregarExperiencia(String exp){
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for(String exp : experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
