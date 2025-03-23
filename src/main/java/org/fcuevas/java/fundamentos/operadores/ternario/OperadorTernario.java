package org.fcuevas.java.fundamentos.operadores.ternario;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Float[] notas = new Float[4];

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.nextLine();

        for(int i = 0; i < 3 ; i++){
            System.out.println("Ingrese la nota '"+(i+1)+"': ");
            notas[i] = leer.nextFloat();
        }
        notas[3] = (notas[0]+notas[1]+notas[2])/3;

        String resultado = notas[3] >= 4.0 ? "Aprobado" : "Reprobado";
        System.out.println("El alumno " + nombre + " tuvo las siguientes notas: " + notas[0] + ", " + notas[1] + ", " + notas[2]);
        System.out.println("El promedio del alumno fue: " + notas[3]);
        System.out.println("La situación final del alumno es: " + resultado);
    }
}
