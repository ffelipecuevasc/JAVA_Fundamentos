package org.fcuevas.java.fundamentos.operadores.unarios;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("OPERADORES UNARIOS");

        int i = -5;

        int j = +i;
        System.out.println("\tValor de j = " + j);

        int k = -i;
        System.out.println("\tValor de k = " + k);

        System.out.println("\nOPERADORES DE INCREMENTO/DECREMENTO");

        int a = 1;
        System.out.println("\tValor INICIAL de a = " + a);

        int b = a++;
        System.out.println("\tValor de a = " + a);
        System.out.println("\tValor de b = " + b);

        int c = ++a;
        System.out.println("\tValor de a = " + a);
        System.out.println("\tValor de c = " + c);

        System.out.println("\tValor de c (a--) = " + (a--));
        System.out.println("\tValor de c (--a) = " + (--a));
    }
}
