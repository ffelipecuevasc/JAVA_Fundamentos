package org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.repositorio;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteRepositorio implements RepositorioI{

    private List<Cliente> clientes;

    public ClienteRepositorio(){
        this.clientes = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> listar() {
        return this.clientes;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;
        for(Cliente aux : clientes){
            if(aux.getId().equals(id)){
                c = aux;
                break;
            }
        }
        return c;
    }

    @Override
    public void crear(Cliente cliente) {
        this.clientes.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.clientes.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        List<Cliente> lista = new ArrayList<>(this.clientes);
        lista.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                int resultado = 0;
                if(direccion == Direccion.ASC){
                    switch(campo){
                        case "id" -> resultado = o1.getId().compareTo(o2.getId());
                        case "nombre" -> resultado = o1.getNombre().compareTo(o2.getNombre());
                        case "apellido" -> resultado = o1.getApellido().compareTo(o2.getApellido());
                    }
                }else if(direccion == Direccion.DESC){
                    switch(campo){
                        case "id" -> resultado = o2.getId().compareTo(o1.getId());
                        case "nombre" -> resultado = o2.getNombre().compareTo(o1.getNombre());
                        case "apellido" -> resultado = o2.getApellido().compareTo(o1.getApellido());
                    }
                }
                return resultado;
            }
        });
        return lista;
    }

    @Override
    public List<Cliente> listar(Integer desde, Integer hasta) {
        return clientes.subList(desde, hasta);
    }

    @Override
    public Integer totalRegistros(){
        return this.clientes.size();
    }
}
