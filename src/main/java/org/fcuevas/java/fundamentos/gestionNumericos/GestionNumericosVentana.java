package org.fcuevas.java.fundamentos.gestionNumericos;

import javax.swing.*;

public class GestionNumericosVentana {
    public static void main(String[] args) {
        String valorDigitado = JOptionPane.showInputDialog(null,"Ingrese el número:");

        int numeroDecimal = Integer.parseInt(valorDigitado);

        String mensaje = "Número digitado en formato decimal = " + numeroDecimal;
        mensaje += "\nNúmero en formato binario = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero en formato octal = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero en formato hexadecimal = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
