package org.fcuevas.java.fundamentos.primitivos;

public class VariablesPrimitivas {
    public static void main(String[] args) {

        //Desde JAVA 10 se pueden definir variables con VAR, no aguanta arreglos.
        //Valores numéricos definidos con VAR son integer por defecto.
        var valor1 = "Felipe Cuevas";
        var valor2 = 10;

        System.out.println("El valor1 es: " + valor1 + " | El valor2 es:" + valor2);
        System.out.println("--------");

        byte valorByte = 127;
        System.out.println("Valor del BYTE: " + valorByte);
        System.out.println("Tipo BYTE corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo BYTE corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor máximo de un BYTE es: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un BYTE es: " + Byte.MIN_VALUE);
        System.out.println("--------");

        short valorShort = 30000;
        System.out.println("Valor del SHORT: " + valorShort);
        System.out.println("Tipo SHORT corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo SHORT corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor máximo de un SHORT es: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un SHORT es: " + Short.MIN_VALUE);
        System.out.println("--------");

        int valorInt = 33000;
        System.out.println("Valor del INT: " + valorInt);
        System.out.println("Tipo INT corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo INT corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor máximo de un INT es: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un INT es: " + Integer.MIN_VALUE);
        System.out.println("--------");

        long valorLong = 22334455669988L;
        System.out.println("Valor del LONG: " + valorLong);
        System.out.println("Tipo LONG corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo LONG corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor máximo de un LONG es: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un LONG es: " + Long.MIN_VALUE);
        System.out.println("--------");

        //En valores con decimales, la E significa que el valor se le agrega un EXPONENTE seguido del
        //número de veces que será multiplicado por 10, provocando que la , se corra esa cantidad
        float valorFloat = 1.5E4F;
        System.out.println("Valor del FLOAT: " + valorFloat);
        System.out.println("Tipo FLOAT corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo FLOAT corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor máximo de un FLOAT es: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un FLOAT es: " + Float.MIN_VALUE);
        System.out.println("--------");

        double valorDouble = 3.5234341341332423E39;
        System.out.println("Valor del DOUBLE: " + valorDouble);
        System.out.println("Tipo DOUBLE corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo DOUBLE corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor máximo de un DOUBLE es: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un DOUBLE es: " + Double.MIN_VALUE);
        System.out.println("--------");
    }
}