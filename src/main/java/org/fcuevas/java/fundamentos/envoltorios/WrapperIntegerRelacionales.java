package org.fcuevas.java.fundamentos.envoltorios;

public class WrapperIntegerRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("¿Son el mismo objeto? = " + (num1 == num2));

        num2 = 1000;

        System.out.println("\nNum1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("¿Son el mismo objeto? = " + (num1 == num2));
        System.out.println("¿Tienen el mismo valor? = " + (num1.equals(num2)));
        System.out.println("¿Tienen el mismo valor? = " + (num1.intValue() == num2.intValue()));

        num2 = 500;

        boolean condicion = num1 > num2;
        System.out.println("\nCondición boleana: " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("Condición boleana 2: " + condicion2);
    }
}
