package org.fcuevas.java.fundamentos.operadores.ejercicios;

import java.util.Scanner;

public class IniciarSesion {
    public static void main(String[] args) {
        String usuario = "Felipe Cuevas";
        String clave = "12345";
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuarioIng = leer.nextLine();

        System.out.println("Ingrese el clave: ");
        String claveIng = leer.nextLine();

        boolean esAutenticado = false;

        if(usuarioIng.equals(usuario) == true && claveIng.equals(clave) == true) esAutenticado = true;

        //if(esAutenticado) es completamente válido también
        if(esAutenticado == true) System.out.println("¡Bienvenido usuario '"+usuarioIng+"'!");
        else System.out.println("Lo sentimos, no está autenticado.");
    }
}
