package org.fcuevas.java.fundamentos.estructuras.ciclicas;

import java.util.Scanner;

public class ForAnidado_Etiquetas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase = "El mejor bootcamp full stack de java de el mundo!";
        System.out.println("Ingrese la palabra: ");
        String palabra = leer.nextLine();

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;

        //Etiqueta para un ciclo for
        buscar:
        for(int i = 0 ; i < maxFrase ; i++){
            int k = i;
            for(int j = 0 ; j < maxPalabra ; j++){
                if(frase.charAt(k++) != palabra.charAt(j)) continue buscar;
            }
            cantidad++;
        }
        System.out.println("Frase = '"+frase+"'");
        System.out.println("Encontrada = '"+cantidad+"' veces la palabra '"+palabra+"' en la frase.");
    }
}
