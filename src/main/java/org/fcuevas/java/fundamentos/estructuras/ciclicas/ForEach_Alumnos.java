package org.fcuevas.java.fundamentos.estructuras.ciclicas;

public class ForEach_Alumnos {
    public static void main(String[] args) {
        String[] alumnos = {"Felipe", "Renato", "Sergio", "Camila", "Paula", "Javiera"};

        System.out.println("FOR EACH - CONTINUE");
        for(String aux : alumnos){
            if(aux.equals("Felipe")) continue;
            System.out.println("Alumno: " + aux);
        }
        System.out.println("\nFOR EACH- BREAK");
        for(String aux : alumnos){
            if(aux.equals("Sergio")) break;
            System.out.println("Alumno: " + aux);
        }

    }
}
