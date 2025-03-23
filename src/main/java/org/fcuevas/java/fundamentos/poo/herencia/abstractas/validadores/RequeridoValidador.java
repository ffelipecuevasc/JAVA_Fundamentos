package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public class RequeridoValidador extends Validador{

    protected String mensaje;

    public RequeridoValidador(){
        this.mensaje = "El campo es requerido.";
    }

    @Override
    public Boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
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
