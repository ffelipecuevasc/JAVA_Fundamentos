package org.fcuevas.java.fundamentos.proyectos.facturacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRun("17.266.346-k");
        cliente.setNombre("Felipe Cuevas");

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(leer.nextLine(), cliente);

        Producto producto;

        System.out.println();
        for(int i=0 ; i<5 ; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(leer.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(leer.nextFloat());

            System.out.println("Ingrese la cantidad: ");
            ItemFactura item = new ItemFactura(leer.nextInt(), producto);
            factura.setItems(item);

            System.out.println();
            leer.nextLine();
        }
        System.out.println(factura.getDetalle());
    }
}
