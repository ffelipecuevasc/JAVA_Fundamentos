package org.fcuevas.java.fundamentos.arreglos.unidimensionales;

import java.util.Arrays;
import java.util.Collections;

public class ArreglosUniIteracionEjercicios {
    public static void main(String[] args) {
        int[] arreglo = {4,6,3,7,8,1,9,2,5,10};

        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado");
        for(Integer aux : arreglo){
            System.out.println("\tValor: " + aux);
        }

        System.out.println("\nArreglo ordenado con valores al lado");
        for(int i=0; i < (arreglo.length - i);i++){
            System.out.print(arreglo[i] + " - ");
            System.out.println(arreglo[arreglo.length-1-i]);
        }

        System.out.println("\nLlenando un arreglo con datos de otros arreglos");
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for (int i = 0;i< a.length;i++) {
            a[i] = i+1;
        }

        for (int i = 0;i< b.length;i++) {
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i = 0;i< a.length;i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for(Integer d : c){
            System.out.println("\tValor de arreglo c : " + d);
        }

        //Ejercicio que detecta el índice con el valor máximo
        int max = 0;
        for(int i=1;i<c.length;i++){
            max = (c[max]>c[i]) ? max : i;
        }
        System.out.println("\nValor máximo: " + c[max]);

        //Ejercicio para detectar el orden de un arreglo
        int[] arregloOrdenar = {6,5,4,3,2,1};
        boolean ordenAsc = false;
        boolean ordenDesc = false;

        for(int i = 0; i < arregloOrdenar.length - 1; i++){
            if(arregloOrdenar[i] < arregloOrdenar[i+1]) ordenAsc = true;
            if(arregloOrdenar[i] > arregloOrdenar[i+1]) ordenDesc = true;
        }
        if(ordenAsc == false && ordenDesc == false) System.out.println("\nTodos los valores son iguales.");
        if(ordenAsc == true && ordenDesc == false) System.out.println("\nOrden del arreglo ascendente.");
        if(ordenAsc == false && ordenDesc == true) System.out.println("\nOrden del arreglo descendente.");
        if(ordenAsc == true && ordenDesc == true) System.out.println("\nOrden del arreglo desordenado.");
    }
}
