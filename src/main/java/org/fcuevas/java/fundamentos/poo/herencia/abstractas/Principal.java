package org.fcuevas.java.fundamentos.poo.herencia.abstractas;

import org.fcuevas.java.fundamentos.poo.herencia.abstractas.select.Opcion;
import org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores.*;

import java.util.ArrayList;
import java.util.List;

//Proyecto que pretende aplicar clases abstractas a una aplicación que crea etiquetas HTML
public class Principal {
    public static void main(String[] args) {
        InputForm usuario = new InputForm("usuario");
        usuario.addValidador(new RequeridoValidador());
        InputForm clave = new InputForm("clave","password");
        clave.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6, 12));
        InputForm correoE = new InputForm("email","email");
        correoE.addValidador(new CorreoValidador()).addValidador(new RequeridoValidador());
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1","Java");
        Opcion python = new Opcion("2","Python");
        Opcion javascript = new Opcion("3","JavaScript");
        Opcion php = new Opcion("4","Php");
        lenguaje.agregarOpcion(java);
        lenguaje.agregarOpcion(python);
        lenguaje.agregarOpcion(javascript);
        lenguaje.agregarOpcion(php);

        usuario.setValor("ffelipecuevasc");
        clave.setValor("felipe_7");
        correoE.setValor("ffelipecuevasc@gmail.com");
        edad.setValor("35");
        java.setSelected(true);
        experiencia.setValor("Más de 10 años de experiencia.");

        List<ElementoForm> elementos = new ArrayList<ElementoForm>();
        elementos.add(usuario);
        elementos.add(clave);
        elementos.add(correoE);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
        }

        System.out.println("\nGeneración de código HTML con expresión lambda");
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });

        System.out.println("\nListado de errores con expresión lambda");
        elementos.forEach(e ->{
            if(!e.esValido()){
                e.getErrores().forEach(err -> {
                    System.out.println(e.getNombre() + " - " + err);
                });
            }
        });
    }
}
