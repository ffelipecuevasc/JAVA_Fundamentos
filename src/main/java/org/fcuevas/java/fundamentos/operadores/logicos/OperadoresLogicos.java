package org.fcuevas.java.fundamentos.operadores.logicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e3F;
        double l = 2.1345e5;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;
        System.out.println("El valor del boleano b1 es: " + b1);

        boolean b2 = i == j || k < 1;
        System.out.println("El valor del boleano b2 es: " + b2);

        boolean b3 = i == j && (k < l || m == true);
        System.out.println("El valor del boleano b3 es: " + b3);
    }
}
