package org.fcuevas.java.fundamentos.poo.sobrecarga;

public class SobrecargaMetodos {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Primer método INT-SUMA : " + calc.sumar(1,2));
        System.out.println("Segundo método FLOAT-SUMA (sobrecarga): " + calc.sumar(1.5F,2.5F));
        System.out.println("Tercer método DOUBLE-SUMA (sobrecarga): " + calc.sumar(3.5,4.5));
        System.out.println("Cuarto método ARREGLO-SUMA (sobrecarga): " + calc.sumar(5,6,7,8,9));
    }
}
