package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio;

public interface RepositorioI extends CrudI, OrdenableI, PaginableI{

    public Integer totalRegistros();
}
