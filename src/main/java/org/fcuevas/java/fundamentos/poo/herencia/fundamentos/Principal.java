package org.fcuevas.java.fundamentos.poo.herencia.fundamentos;

public class Principal {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        alu.setNombre("Felipe");
        alu.setApellido("Cuevas");
        alu.setNota1(5.5);
        alu.setNota2(6.2);
        alu.setNota3(7.0);
        alu.setInstitucion("Instituto Nacional");

        System.out.println("Alumno: " + alu.getNombre() + "  " + alu.getApellido()
                + " (Institución - " + alu.getInstitucion() + ")\n");

        AlumnoInternacional aluInt = new AlumnoInternacional();
        aluInt.setNombre("James");
        aluInt.setApellido("Bond");
        aluInt.setPais("Inglaterra");
        aluInt.setEdad(37);
        aluInt.setInstitucion("English College");
        aluInt.setNota1(6.2);
        aluInt.setNota2(5.2);
        aluInt.setNota3(4.8);

        System.out.println("Alumno Internacional: " + aluInt.getNombre() + "  " + aluInt.getApellido()
                + " (Institución - " + aluInt.getInstitucion() + ")\n");

        Profesor pro = new Profesor();
        pro.setNombre("Esteban");
        pro.setApellido("Valenzuela");
        pro.setAsignatura("POO Java");

        System.out.println("Profesor: " + pro.getNombre() + " " + pro.getApellido());
        System.out.println("Asignatura: " + pro.getAsignatura());

        Persona otroAlu = new Alumno();
        otroAlu.setNombre("Jaime");
        otroAlu.setApellido("Jacob");
        System.out.println("\nOtro alumno: " + otroAlu.getNombre() + " " + otroAlu.getApellido());

        Class clase = aluInt.getClass();
        while(clase.getSuperclass() != null){
            String claseHija = clase.getName();
            String clasePadre = clase.getSuperclass().getName();
            System.out.println(claseHija + " es clase hija de la clase padre " + clasePadre);
            clase = clase.getSuperclass();
        }

        Persona persona = new Persona();
        System.out.println("\nMétodo saludar de Persona\n\t" + persona.saludar());
        System.out.println("\nMétodo saludar de Alumno\n\t" + alu.saludar());
        System.out.println("\nMétodo saludar de Profesor\n\t" + pro.saludar());
        System.out.println("\nMétodo saludar de Alumno Internacional\n\t" + aluInt.saludar());
    }
}
