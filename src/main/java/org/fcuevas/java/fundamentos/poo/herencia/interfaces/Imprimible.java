package org.fcuevas.java.fundamentos.poo.herencia.interfaces;

public interface Imprimible {

    /*A partir de Java 8 las interfaces pueden implementar métodos con el modificador 'default',
    * solo válido para estos contextos ya que un método default en una clase cualquiera está incorrecto:
    *
    *       default void metodoCualquiera(){} - Esto es incorrecto en una clase Java
    *       default void metodoDeInterfaz(){} - Esto es correcto en una interfaz Java
    *
    * También es válido a través de la anotación 'static' porque se puede implementar un método
    * que es parte de la interfaz, no de la implementación de la interfaz ya que no se puede implementar
    * una interfaz:
    *
    *       public static void metodoDeInterfaz(){} - Válido para una interfaz
    *
    * También se pueden declarar atributos en una interfaz, pero solo aquellos que cumplen como
    * constantes, es decir, atributos FINAL.*/
    public String imprimir();
}
