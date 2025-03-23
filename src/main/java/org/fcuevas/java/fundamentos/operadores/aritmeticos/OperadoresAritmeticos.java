package org.fcuevas.java.fundamentos.operadores.aritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 5, b = 4, suma = a + b;

        System.out.println("- Valor de la suma: " + suma);

        //La JVM concatena los valores al reconocer el STRING, no los suma
        System.out.println("- Valor de la suma: " + a + b);

        //Acá la JVM reconoce los int y los suma
        System.out.println("- Valor de la suma: " + (a + b));
        System.out.println(a + b + " - Valor de la suma");

        int resta = a - b;
        System.out.println("- Valor de la resta: " + resta);

        int multiplicacion = a * b;
        System.out.println("- Valor de la multiplicación: " + multiplicacion);

        int division = a / b;
        System.out.println("- Valor de la división: " + division);
        float divisionF = a / b;
        System.out.println("- Valor de la división (float): " + divisionF);

        int resto = a % b;
        System.out.println("- Valor del operador resto: " + resto);
    }
}
