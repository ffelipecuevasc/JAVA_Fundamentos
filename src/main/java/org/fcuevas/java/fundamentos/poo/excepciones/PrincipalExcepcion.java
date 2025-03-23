package org.fcuevas.java.fundamentos.poo.excepciones;

public class PrincipalExcepcion {
    public static void main(String[] args) {
        try {
            Calculadora calc = new Calculadora();
            Double division = calc.division(10, 1);
            System.out.println(division);
            Double divisionString = calc.division("10", "0");
            System.out.println(divisionString);
        }catch(NumberFormatException e){
            System.err.println("Manejamos la excepción en tiempo real: " + e.getMessage());
        }catch(ArithmeticException e) {
            System.err.println("Manejamos la excepción en tiempo real: " + e.getMessage());
        }catch (DivisionPorCeroException e){
            System.err.println("Manejamos la excepción en tiempo real con nuestra EXCEPCION PERSONALIZADA: " + e.getMessage());
        }finally{
            System.out.println("Estructura FINALLY opcional pero que siempre se ejecuta.");
        }
    }
}
