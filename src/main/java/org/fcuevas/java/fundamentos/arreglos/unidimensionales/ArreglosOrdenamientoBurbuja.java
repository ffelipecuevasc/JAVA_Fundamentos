package org.fcuevas.java.fundamentos.arreglos.unidimensionales;

public class ArreglosOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = new String[]{"Pendrive Kingstone 4gb",
                "Notebook Asus",
                "Ratón Lenovo",
                "Pantalla AOC 17\"",
                "Batería externa Samsung",
                "Disco SSD 512gb",
                "Play Station 5"};

        System.out.println("\nArreglo original");
        for(String aux : productos){
            System.out.println("\tProductos: " + aux);
        }

        for(int i = 0; i < productos.length ; i++){
            for(int j = 0; j < productos.length; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        System.out.println("\nArreglo ordenado - BURBUJA");
        for(String aux : productos){
            System.out.println("\tProductos: " + aux);
        }
    }
}
