package org.fcuevas.java.fundamentos.clases.calendar;

import java.util.Calendar;

public class ClaseCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2025, Calendar.FEBRUARY, 26);

        // Obtener información de la fecha
        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Meses comienzan en 0
        int día = calendario.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha: " + día + "/" + mes + "/" + año);

        // Sumar días
        calendario.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Fecha después de 5 días: " + calendario.getTime());
    }
}
