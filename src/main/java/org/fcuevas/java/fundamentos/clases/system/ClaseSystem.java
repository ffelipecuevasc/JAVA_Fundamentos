package org.fcuevas.java.fundamentos.clases.system;

public class ClaseSystem {
    public static void main(String[] args) {
        String usuario = System.getProperty("user.name");
        System.out.println("Clase System USUARIO = " + usuario);

        String hogar = System.getProperty("user.home");
        System.out.println("Clase System HOGAR = " + hogar);

        String espacioTrabajo = System.getProperty("user.dir");
        System.out.println("Clase System ESPACIO DE TRABAJO = " + espacioTrabajo);

        String java = System.getProperty("java.version");
        System.out.println("Clase System VERSIÓN JAVA = " + java);

        String usuarioSystem = System.getenv("USERNAME");
        System.out.println("Clase System USUARIO = " + usuarioSystem);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Clase System JAVA HOME = " + javaHome);
    }
}
