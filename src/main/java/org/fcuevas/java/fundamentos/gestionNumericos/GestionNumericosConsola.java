package org.fcuevas.java.fundamentos.gestionNumericos;

import java.util.Scanner;

public class GestionNumericosConsola {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroDecimal  = leer.nextInt();

        String mensaje = "Número digitado en formato decimal = " + numeroDecimal;
        mensaje += "\nNúmero en formato binario = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero en formato octal = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero en formato hexadecimal = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
        leer.close();
    }
}
