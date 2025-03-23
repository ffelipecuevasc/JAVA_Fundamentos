package org.fcuevas.java.fundamentos.primitivos;

public class BoleanosPrimitivos {
    public static void main(String[] args) {
        boolean a = true;

        double valorD = 9476.32e5;
        float valorF = 13294F;

        boolean b = valorD < valorF;
        boolean c = (1+2 == 3);

        System.out.println("Valor boleano 1: " + a);
        System.out.println("Valor boleano 2: " + b);
        System.out.println("Valor boleano 3: " + c);
    }
}
