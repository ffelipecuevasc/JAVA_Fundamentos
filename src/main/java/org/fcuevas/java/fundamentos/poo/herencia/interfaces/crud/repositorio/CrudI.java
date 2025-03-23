package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio;

import java.util.List;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;

public interface CrudI {

    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);
}
