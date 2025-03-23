package org.fcuevas.java.fundamentos.envoltorios;

public class WrapperInteger {
    public static void main(String[] args) {
        /*Acá se aplica el concepto de 'boxing' donde de manera programática se convierte
        * un valor primitivo a un valor de referencia (objeto) utilizando métodos de la clase
        * Integer*/
        int intPrimitivo = 32;
        Integer intObj = Integer.valueOf(intPrimitivo);
        /*Acá se aplica el concepto de 'autoboxing', o conversión automática, donde automáticamente
        * se convierte el valor primitivo a un valor de referencia (objeto). Este tratamiento lo hace
        * el JC (Java Compiler) que desde Java 5 se incorporó la funcionalidad para facilitar el trabajo
        * con genéricos y colecciones (JCF)*/
        Integer intObj2 = intPrimitivo;
        System.out.println("Integer Objeto: " + intObj);

        /*Acá se aplica el concepto inverso al 'boxing', es decir el 'unboxing', donde se convierte
        * el objeto a un valor primitivo de forma automática*/
        int valor = intObj2;
        System.out.println("Valor: " + valor);
        /*Acá se aplica el 'unboxing' explícito de manera programática utilizando el método
        * intValue() que transforma el valor de referencia a un valor primitivo (innecesario)*/
        int valor2 = intObj2.intValue();
        System.out.println("Valor 2: " + valor2);
        /*Acá se aplica el 'autounboxing' donde se convierte de forma automática el valor de referencia
        * a un valor primitivo, tratamiento que hacer el JC desde Java 5*/
        Integer valorInt = 100;
        int valor3 = valorInt;
        System.out.println("Valor 3: " + valor3);

        String valorString = "1914";
        Integer valorInteger = Integer.parseInt(valorString);
        System.out.println("Valor de String a Integer: " + valorInteger);

        Short valorShort = intObj.shortValue();
        System.out.println("Valor de Integer a Short: " + valorShort);

        Byte valorByte = intObj2.byteValue();
        System.out.println("Valor de Integer a Byte: " + valorByte);

        Long valorLong = intObj.longValue();
        System.out.println("Valor de Integer a Long: " + valorLong);
    }
}
