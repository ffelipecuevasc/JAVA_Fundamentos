package org.fcuevas.java.fundamentos.operadores.aritmeticos;

public class EjercicioMod {
    public static void main(String[] args) {
        System.out.println("ALGORITMOS");
        System.out.println("1 - SUMATORIA DE NÚMEROS PRIMOS");
            sumatoriaPrimos();
        System.out.println("2 - TICTOC PRIMOS");
            primosTicToc();
    }

    public static void sumatoriaPrimos(){
        System.out.println("Sumatoria de todos los números primos de 3 y 5 < 1.000");
        int sumatoria = 0;
        for(int i = 0; i < 1000 ; i++){
            if((i % 3 == 0) || (i % 5 == 0)) sumatoria += i;
        }
        System.out.println("- " + sumatoria);
    }

    public static void primosTicToc(){
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)) System.out.println("TicToc");
            else if(i % 3 == 0) System.out.println("Tic");
            else if(i % 5 == 0) System.out.println("Toc");
            else System.out.println("- " + i);
        }
    }
}
