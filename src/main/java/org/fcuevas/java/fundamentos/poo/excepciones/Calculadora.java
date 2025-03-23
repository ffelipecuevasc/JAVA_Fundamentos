package org.fcuevas.java.fundamentos.poo.excepciones;

public class Calculadora {

    public Double division(int numerador, int divisor) throws DivisionPorCeroException{
        if(divisor == 0) throw new DivisionPorCeroException("No se puede dividir por cero.");
        return (double) (numerador/divisor);
    }

    public Double division(String numerador, String divisor) throws DivisionPorCeroException{
        int num = Integer.parseInt(numerador);
        int div = Integer.parseInt(divisor);
        return this.division(num, div);
    }
}
