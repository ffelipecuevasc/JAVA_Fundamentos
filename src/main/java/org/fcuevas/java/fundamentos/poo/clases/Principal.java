package org.fcuevas.java.fundamentos.poo.clases;

public class Principal {
    public static void main(String[] args) {

        /*Creación de instancias accediendo de forma directa a sus atributos (no recomendado)
        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impresa";
        subaru.color = "Gris";
        subaru.cilindrada = 2.0;

        System.out.println("Auto Fabricante: " + subaru.fabricante);
        System.out.println("Auto Modelo: " + subaru.modelo);
        System.out.println("Auto Color: " + subaru.color);
        System.out.println("Auto Cilindrada: " + subaru.cilindrada);

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "Azul";
        mazda.cilindrada = 2.5;

        System.out.println("\nAuto Fabricante: " + mazda.fabricante);
        System.out.println("Auto Modelo: " + mazda.modelo);
        System.out.println("Auto Color: " + mazda.color);
        System.out.println("Auto Cilindrada: " + mazda.cilindrada);*/

        //Creación de instancias accediendo a el estado interno a través de métodos
        Automovil toyota = new Automovil();
        Conductor c1 = new Conductor("Felipe","Cuevas");
        toyota.setFabricante("Toyota");
        toyota.setModelo("Rush");
        toyota.setColor(Color.AZUL);
        toyota.setCilindrada(1.5);
        toyota.setConductor(c1);
        toyota.detalle();

        Automovil opel = new Automovil();
        Conductor c2 = new Conductor("Michael","Schumajer");
        opel.setFabricante("Opel");
        opel.setModelo("Vectra");
        opel.setColor(Color.NEGRO);
        opel.setCilindrada(1.0);
        opel.setConductor(c2);
        System.out.println(opel.detalleStringBuilder());
        System.out.println(opel.acelerar(2500));
        System.out.println(opel.frenar());
        System.out.println(opel.acelerarFrenar(3500));
        System.out.println("Kilómetros por litro: " + opel.calcularConsumo(300, 0.75F));
        System.out.println("Kilómetros por litro: " + opel.calcularConsumo(300, 65));

        Automovil opel2 = new Automovil();
        Conductor c3 = new Conductor("Jaime","Jacob");
        opel2.setFabricante("Opel");
        opel2.setModelo("Vectra");
        opel2.setColor(Color.BLANCO);
        opel2.setCilindrada(1.2);
        opel2.setConductor(c3);
        System.out.println("\nMétodo EQUALS sobrescrito: " + toyota.equals(opel));
        System.out.println("Método EQUALS sobrescrito: " + opel.equals(opel2));
        System.out.println("Método TO STRING sobrescrito: " + opel2);
        System.out.println("Constante Velocidad Máxima Carretera (kms/hr): " + Automovil.VEL_MAX_CARRETERA);
        System.out.println("Constante Velocidad Máxima Ciudad (kms/hr): " + Automovil.VEL_MAX_CIUDAD);
    }
}
