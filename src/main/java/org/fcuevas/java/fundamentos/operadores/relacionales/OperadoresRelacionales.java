package org.fcuevas.java.fundamentos.operadores.relacionales;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e3F;
        double l = 2.1345e5;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("Valor del boleano b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("Valor del boleano b2 = " + b2);

        boolean b3 = i != j;
        System.out.println("Valor del boleano b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("Valor del boleano b4 = " + b4);

        boolean b5 = i < j;
        System.out.println("Valor del boleano b5 = " + b5);

        boolean b6 = (i >= j);
        System.out.println("Valor del boleano b6 = " + b6);
    }
}
