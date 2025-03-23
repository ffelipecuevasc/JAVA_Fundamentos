package org.fcuevas.java.fundamentos.envoltorios;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean boleanoPrimitivo = num1 > num2;
        Boolean boleanoObjeto = Boolean.valueOf(boleanoPrimitivo);
        Boolean boleanoObjeto2 = Boolean.valueOf("false");
        Boolean boleanoObjeto3 = false;

        System.out.println("Boleano Primitivo: " + boleanoPrimitivo);
        System.out.println("Boleano Objeto 1: " + boleanoObjeto);
        System.out.println("Boleano Objeto 2: " + boleanoObjeto2);
        System.out.println("1) Comparación de los 2 objetos boleanos: " + (boleanoObjeto == boleanoObjeto2));
        System.out.println("2) Comparación de los 2 objetos boleanos: " + (boleanoObjeto.equals(boleanoObjeto2)));
        System.out.println("3) Comparación de los 2 objetos boleanos: " + (boleanoObjeto == boleanoObjeto3));
        System.out.println("4) Comparación de los 2 objetos boleanos: " + (boleanoObjeto2 == boleanoObjeto3));
    }
}
