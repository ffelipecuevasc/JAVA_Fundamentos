package org.fcuevas.java.fundamentos.operadores.asignacion;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 2;
        int j = i + 1;

        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);

        j += 2;
        System.out.println("Valor de j (asignación +) = " + j);

        j -= 1;
        System.out.println("Valor de j (asignación -) = " + j);

        j *= 2;
        System.out.println("Valor de j (asignación *) = " + j);

        j /= 2;
        System.out.println("Valor de j (asignación /) = " + j);

        String frase = "\nOperador de asignación en un STRING\n";
        frase += "- Iniciando con ";
        frase += "el nombre mío, ";
        frase += "Felipe Cuevas.";
        System.out.println(frase);
    }
}
