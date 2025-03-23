package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;

import java.util.List;

public interface PaginableI {
    List<Cliente> listar(Integer desde, Integer hasta);
}
