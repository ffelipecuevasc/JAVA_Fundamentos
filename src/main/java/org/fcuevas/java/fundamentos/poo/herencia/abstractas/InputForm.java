package org.fcuevas.java.fundamentos.poo.herencia.abstractas;

public class InputForm extends ElementoForm{

    private String tipo;

    {
        tipo = "texto";
    }

    public InputForm(String nombre){
        super(nombre);
    }

    public InputForm(String nombre, String tipo){
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml(){
        return "<input type=\""+ this.tipo
                +"\" name=\""+ this.nombre
                +"\" value=\""+ this.valor +"\" >";
    }
}
