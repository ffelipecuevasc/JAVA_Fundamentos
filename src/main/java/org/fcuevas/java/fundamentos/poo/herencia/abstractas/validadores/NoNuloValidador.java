package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public class NoNuloValidador extends Validador{

    protected String mensaje;

    public NoNuloValidador(){
        this.mensaje = "El campo no puede ser nulo";
    }

    @Override
    public Boolean esValido(String valor) {
        return (valor != null);
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
}
