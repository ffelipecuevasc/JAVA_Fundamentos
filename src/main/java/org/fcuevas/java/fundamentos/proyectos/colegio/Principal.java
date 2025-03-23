package org.fcuevas.java.fundamentos.proyectos.colegio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombre(leer.next());
        System.out.println("\nIngreso de alumnos");
        Alumno[] alumnos = new Alumno[2];
        for(int i=0;i<2;i++){
            Alumno a = new Alumno();
            System.out.println("\nIngrese el RUN: ");
            a.setRun(leer.next());
            System.out.println("Ingrese el nombre: ");
            a.setNombre(leer.next());
            System.out.println("Ingrese la edad: ");
            a.setEdad(leer.nextInt());
            System.out.println("Ingrese la asistencia: ");
            a.setAsistencia(leer.nextInt());
            System.out.println("Ingrese la asignatura: ");
            Asignatura asignatura = new Asignatura(leer.next());
            Evaluacion[] evaluaciones = new Evaluacion[3];
            for(int j=0;j<3;j++){
                System.out.println("Ingrese la nota " + (j+1) + ": ");
                Evaluacion eva = new Evaluacion(leer.nextDouble(), asignatura);
                evaluaciones[j] = eva;
            }
            a.setEvaluaciones(evaluaciones);
            alumnos[i] = a;
        }
        curso.setAlumnos(alumnos);

        System.out.println("\nMostrando datos\n");
        System.out.println(curso);
    }
}
