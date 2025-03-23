package org.fcuevas.java.fundamentos.estructuras.ciclicas;

public class For_Alumnos {
    public static void main(String[] args) {
        String[] alumnos = {"Felipe", "Renato", "Sergio", "Camila", "Paula", "Javiera"};

        System.out.println("FOR - CONTINUE");
        for(int i = 0 ; i < alumnos.length ; i++){
            if(alumnos[i].equals("Felipe")) continue;
            System.out.println("Alumno: " + alumnos[i]);
        }
        System.out.println("\nFOR - BREAK");
        for(int i = 0 ; i < alumnos.length ; i++){
            if(alumnos[i].equals("Sergio")) break;
            System.out.println("Alumno: " + alumnos[i]);
        }
    }
}
