package org.fcuevas.java.fundamentos.arreglos.unidimensionales;

import java.util.Arrays;
import java.util.Collections;

public class ArreglosUniCollections {
    public static void main(String[] args) {
        String[] productos = new String[]{"Pendrive Kingstone 4gb",
                "Notebook Asus",
                "Ratón Lenovo",
                "Pantalla AOC 17\"",
                "Batería externa Samsung",
                "Disco SSD 512gb",
                "Play Station 5"};

        System.out.println("\n--------- COLLECTIONS SORT");
        Collections.sort(Arrays.asList(productos));
        for(String aux : productos){
            System.out.println("Productos : " + aux);
        }

        System.out.println("\n--------- COLLECTIONS REVERSE");
        Collections.reverse(Arrays.asList(productos));
        for(String aux : productos){
            System.out.println("Productos : " + aux);
        }

        System.out.println("\n--------- COLLECTIONS SHUFFLE");
        Collections.shuffle(Arrays.asList(productos));
        for(String aux : productos){
            System.out.println("Productos : " + aux);
        }
    }
}
