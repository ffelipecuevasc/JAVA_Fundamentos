package org.fcuevas.java.fundamentos.poo.herencia.abstractas;

import org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm {

    protected String valor, nombre;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm(){
        this.validadores = new ArrayList<Validador>();
        this.errores = new ArrayList<String>();
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean esValido(){
        for(Validador v : validadores){
            if(!v.esValido(this.valor)) this.errores.add(v.getMensaje());
        }
        return this.errores.isEmpty();
    }

    public List<String> getErrores(){
        return errores;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
