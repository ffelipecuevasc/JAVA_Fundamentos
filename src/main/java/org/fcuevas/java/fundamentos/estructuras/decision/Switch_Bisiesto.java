package org.fcuevas.java.fundamentos.estructuras.decision;

import java.util.Scanner;

public class Switch_Bisiesto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombreMes = null;
        String nombreAño = "Normal";
        int dias = 0;

        System.out.println("Ingrese el año: ");
        int año = leer.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();

        switch (mes){
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = (año % 400 == 0 || ((año % 4 == 0) && !(año % 100 == 0))) ? 29 : 28;
                if(dias == 29) nombreAño = "Bisiesto";
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default:
                nombreMes = "Inválido";
                break;
        }

        System.out.println("Año: " + año + " ('"+nombreAño+"') | Mes: " + nombreMes + " | Cantidad de días: " + dias);
    }
}
