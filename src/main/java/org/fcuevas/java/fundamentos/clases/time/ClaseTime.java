package org.fcuevas.java.fundamentos.clases.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClaseTime {
    public static void main(String[] args) {
        /*Ni Date ni Calendar son recomendados en Java moderno. Ambas salieron en Java 1 (1.0 y 1.1)
        En su lugar, se recomienda usar la API de fechas y horas de Java 8 (java.time)*/

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual: " + fechaActual);

        // Fecha y Hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y Hora Actual: " + fechaHoraActual);

        // Formateando la fecha y hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaFormateada = fechaHoraActual.format(formato);
        System.out.println("Fecha Formateada: " + fechaFormateada);

        // Sumar días
        LocalDate fechaFutura = fechaActual.plusDays(5);
        System.out.println("Fecha después de 5 días: " + fechaFutura);
    }
}
