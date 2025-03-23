package org.fcuevas.java.fundamentos.poo.sobrecarga;

public class Calculadora {
    private int a;
    private int b;

    public int sumar(int a, int b){
        return a + b;
    }

    public int sumar(float a, float b){
        return (int)(a + b);
    }

    public int sumar(double a, double b){
        return (int)(a + b);
    }

    public int sumar(int... variables){
        int total = 0;
        for(int aux : variables){
            total += aux;
        }
        return total;
    }
}
