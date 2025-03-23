package org.fcuevas.java.fundamentos.poo.herencia.genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Transporte <T> implements Iterable <T>{
    private List<T> objetos;
    private Integer max;

    public Transporte(Integer max){
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public Transporte <T> agregar(T objeto){
        if(this.objetos.size() <= max) this.objetos.add(objeto);
        else throw new RuntimeException("No hay más espacio.");
        return this;
    }

    @Override
    public Iterator <T> iterator() {
        return this.objetos.iterator();
    }
}
