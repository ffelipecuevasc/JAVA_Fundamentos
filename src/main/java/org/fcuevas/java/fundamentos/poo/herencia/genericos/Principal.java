package org.fcuevas.java.fundamentos.poo.herencia.genericos;

import org.fcuevas.java.fundamentos.poo.herencia.interfaces.crud.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//El siguiente proyecto aprovecha todo lo creado en el paquete 'interfaces' para explicar JAVA Generics
public class Principal {
    public static void main(String[] args) {
        Cliente[] clientes = {new Cliente("Felipe","Cuevas"),
                new Cliente("Jaime","Jacob"),
                new Cliente("Chuck","Norris")};
        List<Cliente> listadoClientes = deArrayAList(clientes);
        System.out.println(listadoClientes);

        Integer[] numeros = {1,2,3,4,5};
        List<Integer> listadoNumeros = deArrayAList(numeros);
        System.out.println(listadoNumeros);

        System.out.println("Máximo entre 7, 2, 3 = '" + maximo(7, 2, 3) + "'");
        System.out.println("Máximo entre Felipe, Jaime, Chuck = '" + maximo("Felipe", "Jaime", "Chuck") + "'");

        Transporte<Animal> animalTransporte = new Transporte<Animal>(3);
        animalTransporte.agregar(new Animal("Firulais"))
                .agregar(new Animal("Cochinon"))
                .agregar(new Animal("Byron"));

        /*La razón por la que puedes recorrer directamente la instancia animalTransporte en el
        for-each sin llamar a getObjetos() es porque la clase Transporte<T> implementa Iterable<T>.
        Esto significa que cualquier objeto de Transporte<T> se puede recorrer directamente en un for-each.*/
        for(Animal a : animalTransporte){
            System.out.println(a.getNombre());
        }

        Transporte<Cosa> cosaTransporte = new Transporte<>(3);
        cosaTransporte.agregar(new Cosa("Computador"))
                .agregar(new Cosa("Mesa"))
                .agregar(new Cosa("Zapatos"));
        for(Cosa c : cosaTransporte){
            System.out.println(c.getNombre());
        }
    }

    /*¿Por qué tiene <T> antes del tipo de retorno?
    <T> define que el método es genérico, lo que significa que puede aceptar arreglos de
    cualquier tipo (Integer, String, Double, etc.). T es una variable de tipo genérico que
    se reemplaza automáticamente según el tipo del array que pases.

    ¿Es obligatorio usar <T> antes del tipo de retorno?
    Sí, es obligatorio si quieres que el método sea genérico. Si omites <T>, el compilador
    no entenderá que el método es genérico, y T será desconocido, causando un error de compilación.

    No solo existe T en genéricos de Java.
    - T, E, K, V, N son nombres convencionales de parámetros de tipo en Generics:
    - T (Type) → Tipo genérico general.
    - E (Element) → Para colecciones.
    - K (Key) y V (Value) → Usados en Map<K, V>.
    - N (Number) → Se usa para valores numéricos.
    - Puedes usar cualquier letra o palabra en lugar de estos nombres convencionales, pero
    se recomienda seguir las prácticas estándar para mejorar la legibilidad.*/
    public static <T> List<T> deArrayAList(T[] c){
        return Arrays.asList(c);
    }

    /*Acá se genera sobrecarga de método para demostrar la limitación en Java Generics, o también
    * conocida como Bounded Generics, donde se establece que el tipo de dato genérico debe heredar de
    * determinada clase, por ejemplo de la clase Number, estableciendo que sean solo Integer, Short, etc.*/
    public static <T extends Number> List<T> deArrayAList(T[] c){
        return Arrays.asList(c);
    }

    /*Acá se crea un método para retornar tipos de datos que hereden de la interfaz Comparable, es decir
    * objetos de la clase Integer o String. Analiza 3 parámetros y establece el mayor.*/
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;
        return max;
     }
}
