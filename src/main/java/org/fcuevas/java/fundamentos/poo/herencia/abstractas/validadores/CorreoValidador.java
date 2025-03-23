package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public class CorreoValidador extends Validador{

    protected String mensaje;
    private static final String EMAIL_REGEX = "^(.+)@(.+)$";

    public CorreoValidador(){
        this.mensaje = "El formato del correo electrónico debe ser válido.";
    }

    @Override
    public Boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
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
