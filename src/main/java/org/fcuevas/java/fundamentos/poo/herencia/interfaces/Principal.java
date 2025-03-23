package org.fcuevas.java.fundamentos.poo.herencia.interfaces;


//Las clases de este paquete están destinadas a aplicar contenido relacionado a interfaces y clases abstractas
public class Principal {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Felipe Cuevas",
                "Ingeniero Informatico",
                "Resumen Laboral.");
        cv.agregarExperiencia("Java - 10 años")
                .agregarExperiencia("Php - 10 años")
                .agregarExperiencia("JavaScript - 10 años")
                .agregarExperiencia("MySql - 10 años");

        Informe informe = new Informe("Chuck Norris","Steven Seagal","Certificación OCA");

        Libro libro = new Libro("Tom Cruise","Mision Imposible",Genero.ACCION);
        libro.agregarPagina(new Pagina("Mision Imposible 1"))
                        .agregarPagina(new Pagina("Mision Imposible 2"))
                        .agregarPagina(new Pagina("Mision Imposible 3"))
                        .agregarPagina(new Pagina("Mision Imposible 4"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
