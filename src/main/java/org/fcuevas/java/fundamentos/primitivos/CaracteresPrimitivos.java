package org.fcuevas.java.fundamentos.primitivos;

public class CaracteresPrimitivos {
    public static void main(String[] args) {
        char caracter = '@';
        char caracterUnicode = '\u0040';
        char caracterDecimal = 64;

        System.out.println("Caracter : " + caracter + " | Caracter Unicode : " + caracterUnicode + " | Caracter Decimal : " + caracterDecimal);

        System.out.println("Tipo CHAR corresponde en bytes a: " + Character.BYTES);
        System.out.println("Tipo CHAR corresponde en bits a: " + Character.SIZE);
        System.out.println("Valor máximo de un CHAR es: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un CHAR es: " + Character.MIN_VALUE);

        //CaracteresPrimitivos especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char saltoDeLinea = '\n';

        System.out.println("Probando caracteres especiales: Presencia" + espacio + "del" + espacio + "espacio");

    }
}
