package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;

import java.util.List;

public interface OrdenableI {
    List<Cliente> listar(String campo, Direccion direccion);

}
