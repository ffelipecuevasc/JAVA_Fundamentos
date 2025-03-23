package org.fcuevas.java.fundamentos.estructuras.decision;

import java.util.Scanner;

public class If_Bisiesto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el año: ");
        int año = leer.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();

        int dias = 0;

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            dias = 31;
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias = 30;
        else if(mes == 2)
            dias = (año % 400 == 0 || ((año % 4 == 0) && !(año % 100 == 0))) ? 29 : 28;

        System.out.println("La cantidad de días del mes es: " + dias);
    }
}
