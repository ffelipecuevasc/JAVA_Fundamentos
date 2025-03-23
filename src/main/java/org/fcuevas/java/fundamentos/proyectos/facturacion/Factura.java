package org.fcuevas.java.fundamentos.proyectos.facturacion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int id, indiceItems;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private static final int MAX_ITEMS = 10;
    private static int ultimoId;

    {
        this.id = ++ultimoId;
    }

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = new Date();
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void setItems(ItemFactura item) {
        if(indiceItems < MAX_ITEMS) this.items[indiceItems] = item;
    }

    public float getTotal(){
        float total = 0.0F;
        for(ItemFactura item : this.items){
            if(item == null) continue;
            total += item.getImporte();
        }
        return total;
    }

    public String getDetalle(){
        StringBuilder sb = new StringBuilder("Factura n°: ");
        sb.append(this.id)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tRUN: ")
                .append(this.cliente.getRun())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\tCantidad\tTotal\n");
        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(formato.format(this.fecha))
                .append("\n");
        for(ItemFactura item : this.items){
            if(item == null) continue;
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.getImporte())
                    .append("\n");
        }
        return sb.toString();

    }
}
