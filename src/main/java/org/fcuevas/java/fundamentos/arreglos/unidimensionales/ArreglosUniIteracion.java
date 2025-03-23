package org.fcuevas.java.fundamentos.arreglos.unidimensionales;

public class ArreglosUniIteracion {
    public static void main(String[] args) {
        String[] productos = new String[]{"Pendrive Kingstone 4gb",
                "Notebook Asus",
                "Ratón Lenovo",
                "Pantalla AOC 17\"",
                "Batería externa Samsung",
                "Disco SSD 512gb",
                "Play Station 5"};

        System.out.println("Imprimiendo datos con un FOR:");
        for(int i = 0;i< productos.length;i++){
            System.out.println("\tProducto ["+(i+1)+"]: " + productos[i]);
        }

        System.out.println("\nImprimiendo datos con un FOR INVERSO:");
        for(int i = 6;i >= 0;i--){
            System.out.println("\tProducto ["+(i+1)+"]: " + productos[i]);
        }

        System.out.println("\nImprimiendo datos con un FOR EACH:");
        for(String aux : productos){
            System.out.println("\tProducto: " + aux);
        }


    }
}
