package org.fcuevas.java.fundamentos.consola;

public class AplicacionConsola {

    /**El siguiente método está configurado para funcionar con líneas de comando (consola), la manera
     * original en la que se iniciaban las aplicaciones en Java. Para eso hay que ubicarse en la carpeta
     * donde está la clase y ejecutar el comando 'javac' más el nombre de la clase junto a su extensión
     * (AplicacionConsola.java). Al hacer esto, el JC genera el bytecode en formato de archivo *.class,
     * con ese archivo ya creado ahora queda aplicar el comando 'java' junto al nombre de la clase sin
     * la extensión, lo que se puede agregar a continuación son los argumentos que recibirá el método
     * main() de esta clase.*/
    public static void main(String[] args) {
        String operación = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;
        switch(operación){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if(b == 0) System.exit(-1);
                resultado = a/b;
                break;
            default:
                resultado = a+b;
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
