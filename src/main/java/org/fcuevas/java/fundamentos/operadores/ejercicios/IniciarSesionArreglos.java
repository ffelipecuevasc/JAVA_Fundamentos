package org.fcuevas.java.fundamentos.operadores.ejercicios;

import java.util.Scanner;

public class IniciarSesionArreglos {
    public static void main(String[] args) {
        String[] usuario = {"Felipe","Admin","Francisco"};
        String[] clave = {"123","Admin","321"};
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuarioIngresado = leer.nextLine();

        System.out.println("Ingrese la clave: ");
        String claveIngresada = leer.nextLine();

        boolean esAutenticado = false;
        for(int i = 0; i < usuario.length ; i++){
            if(usuarioIngresado.equals(usuario[i]) == true && claveIngresada.equals(clave[i]) == true){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado == true) System.out.println("¡Bienvenido usuario '"+usuarioIngresado+"'!");
        else System.out.println("Lo sentimos, no está autenticado.");
    }
}
