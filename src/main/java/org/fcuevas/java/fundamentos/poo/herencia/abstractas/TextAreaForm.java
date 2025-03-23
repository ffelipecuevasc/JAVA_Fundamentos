package org.fcuevas.java.fundamentos.poo.herencia.abstractas;

public class TextAreaForm extends ElementoForm{

    private Integer filas;
    private Integer columnas;

    public TextAreaForm(String nombre){
        super(nombre);
    }

    public TextAreaForm(String nombre, Integer filas, Integer columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public Integer getFilas() {
        return filas;
    }

    public void setFilas(Integer filas) {
        this.filas = filas;
    }

    public Integer getColumnas() {
        return columnas;
    }

    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml(){
        return "<textarea name='"+ this.nombre
                +"' cols='"+ this.columnas
                +"' rows='"+ this.filas
                +"'>"+ this.valor +"</textarea>";
    }
}
