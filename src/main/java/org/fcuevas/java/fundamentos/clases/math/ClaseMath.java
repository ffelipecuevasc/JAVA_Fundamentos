package org.fcuevas.java.fundamentos.clases.math;

import java.util.Random;

public class ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("Math absoluto = " + absoluto);

        //No puede devolver un + porque no hay un valor + correspondiente en el rango de esos tipos de datos.
        int absoluto2 = Math.abs(Integer.MIN_VALUE);
        System.out.println("Math absoluto de INTEGER MIN_VALUE = " + absoluto2);

        double max = Math.max(3.5, 1.2);
        System.out.println("Máximo entre 2 doubles = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Mínimo entre 2 doubles = " + min);

        double aproximarArriba = Math.ceil(3.4);
        System.out.println("Aproximado del valor ARRIBA= " + aproximarArriba);

        double aproximarAbajo = Math.floor(3.6);
        System.out.println("Aproximado del valor ABAJO = " + aproximarAbajo);

        double redondear = Math.round(Math.PI);
        System.out.println("Redondear valor = " + redondear);

        //Uso del método 'random' que retorna un double entre 0 - 1
        String[] colores = {"Azul","Amarillo","Rojo","Verde","Negro","Blanco"};
        double aleatorio = Math.random();
        System.out.println("El color es: " + colores[(int) aleatorio]);

        Random random = new Random();
        int aleatorioInt = random.nextInt(7);
        System.out.println("El color es: " + colores[aleatorioInt]);
    }
}
