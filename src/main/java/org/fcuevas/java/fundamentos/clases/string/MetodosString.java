package org.fcuevas.java.fundamentos.clases.string;

public class MetodosString {
    public static void main(String[] args) {
        String nombre = "Felipe Cuevas";

        System.out.println("LENGHT");
        System.out.println("\t" + "- " + nombre.length());

        System.out.println("TO UPPER CASE");
        System.out.println("\t" + "- " + nombre.toUpperCase());

        System.out.println("TO LOWER CASE");
        System.out.println("\t" + "- " + nombre.toLowerCase());

        System.out.println("EQUALS ('felipe cuevas')");
        System.out.println("\t" + "- " + nombre.equals("felipe cuevas"));

        System.out.println("EQUALS IGNORE CASE ('felipe cuevas')");
        System.out.println("\t" + "- " + nombre.equalsIgnoreCase("felipe cuevas"));

        System.out.println("COMPARE TO ('Felipe Cuevas')");
        System.out.println("\t" + "- " + nombre.compareTo("Felipe Cuevas"));

        System.out.println("COMPARE TO ('Cuevas')");
        System.out.println("\t" + "- " + nombre.compareTo("Cuevas"));

        System.out.println("CHAR AT (0)");
        System.out.println("\t" + "- " + nombre.charAt(0));

        System.out.println("CHAR AT (1)");
        System.out.println("\t" + "- " + nombre.charAt(1));

        System.out.println("REPLACE (e > i)");
        System.out.println("\t" + "- " + nombre.replace("e","i"));

        System.out.println("INDEX OF (e)");
        System.out.println("\t" + "- " + nombre.indexOf('e'));

        System.out.println("LAST INDEX OF (e)");
        System.out.println("\t" + "- " + nombre.lastIndexOf('e'));

        System.out.println("CONTAINS (e)");
        System.out.println("\t" + "- " + nombre.contains("e"));

        System.out.println("STARTS WITH (Fe)");
        System.out.println("\t" + "- " + nombre.startsWith("Fe"));

        System.out.println("ENDS WITH (vas)");
        System.out.println("\t" + "- " + nombre.endsWith("vas"));

        //Elimina los espacios al inicio y al final solamente
        System.out.println("TRIMS");
        System.out.println("\t" + "- " + nombre.trim());

        System.out.println("SUBSTRING (apellido)");
        System.out.println("\t" + "- " + nombre.substring(nombre.length() - 6));
    }
}
