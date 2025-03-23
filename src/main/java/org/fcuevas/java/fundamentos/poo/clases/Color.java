package org.fcuevas.java.fundamentos.poo.clases;

public enum Color {
    NEGRO("Negro profundo"),
    BLANCO("Blanco tornasol"),
    GRIS("Gris mate"),
    AZUL("Azul metálico"),
    ROJO("Rojo italiano"),
    VERDE("Verde esmeralda"),
    AMARILLO("Amarillo eléctrico");

    private final String detalle;

    Color(String detalle){
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }
}
