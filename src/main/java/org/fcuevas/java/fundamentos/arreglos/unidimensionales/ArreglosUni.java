package org.fcuevas.java.fundamentos.arreglos.unidimensionales;

import java.util.Arrays;

public class ArreglosUni {
    public static void main(String[] args) {
        String[] productos = new String[]{"Pendrive Kingstone 4gb",
                "Notebook Asus",
                "Ratón Lenovo",
                "Pantalla AOC 17\"",
                "Batería externa Samsung",
                "Disco SSD 512gb",
                "Play Station 5"};
        /*Java permite múltiples declaraciones para los arreglos:
        * - String[] productos; -> Es la más recomendada por convención (legible, clara, estándar)
        * - String productos[]; -> Válida pero antigua, se heredó de C para asimilar Java mejor
        * - String[] productos = new String[7];
        * - String productos[] = new String[7];
        * - String[] productos = {"a","b"};
        * - String productos[] = {"a","b"};
        * - String[] productos = new String[]{"a","b"};
        * - String productos[] = new String[]{"a","b"};*/

        //Método que salió en JAVA 1 y es útil para arreglos pequeños
        Arrays.sort(productos);
        System.out.println("Producto 1: " + productos[0]);
        System.out.println("Producto 2: " + productos[1]);
        System.out.println("Producto 3: " + productos[2]);
        System.out.println("Producto 4: " + productos[3]);
        System.out.println("Producto 5: " + productos[4]);
        System.out.println("Producto 6: " + productos[5]);
        System.out.println("Producto 7: " + productos[6]);

        //Método que salió con JAVA 8 y es más eficiente, demora mucho menos en arreglos grandes
        Arrays.parallelSort(productos);
        System.out.println("Producto 1: " + productos[0]);
        System.out.println("Producto 2: " + productos[1]);
        System.out.println("Producto 3: " + productos[2]);
        System.out.println("Producto 4: " + productos[3]);
        System.out.println("Producto 5: " + productos[4]);
        System.out.println("Producto 6: " + productos[5]);
        System.out.println("Producto 7: " + productos[6]);
    }
}
