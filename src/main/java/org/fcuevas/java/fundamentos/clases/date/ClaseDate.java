package org.fcuevas.java.fundamentos.clases.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaNueva = formato.format(fecha);
        System.out.println("Fecha Nueva Formateada = " + fechaNueva);

        SimpleDateFormat formato2 = new SimpleDateFormat("dd-MM-yyyy");
        String fechaNueva2 = formato2.format(fecha);
        System.out.println("Fecha Nueva Formateada 2 = " + fechaNueva2);
    }
}
