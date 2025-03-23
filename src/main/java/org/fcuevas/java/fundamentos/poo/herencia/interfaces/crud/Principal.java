package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;
import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio.*;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        RepositorioI rep = new ClienteRepositorio();
        rep.crear(new Cliente("Felipe","Cuevas"));
        rep.crear(new Cliente("Camila","Jacob"));
        rep.crear(new Cliente("Jaime","Jacob"));
        rep.crear(new Cliente("Daniel","Cuevas"));

        System.out.println("TOTAL DE REGISTROS " + rep.totalRegistros());
        List<Cliente> clientes = rep.listar();
        for(Cliente aux : clientes){
            System.out.println(aux);
        }

        System.out.println("\nRESULTADOS FILTRADOS");
        List<Cliente> paginable = rep.listar(0,2);
        for(Cliente aux : paginable){
            System.out.println(aux);
        }

        System.out.println("\nRESULTADOS ORDENADOS");
        List<Cliente> ordenados = rep.listar("nombre", Direccion.DESC);
        for(Cliente aux : ordenados){
            System.out.println(aux);
        }

        System.out.println("\nRESULTADOS EDITADOS");
        Cliente clienteEditado = new Cliente("Chuck","Norris");
        clienteEditado.setId(2);
        rep.editar(clienteEditado);
        List<Cliente> clientesEditados = rep.listar();
        for(Cliente aux : clientesEditados){
            System.out.println(aux);
        }

        System.out.println("\nELIMINANDO CLIENTES");
        rep.eliminar(4);
        List<Cliente> eliminacionClientes = rep.listar();
        for(Cliente aux : eliminacionClientes){
            System.out.println(aux);
        }
    }
}
