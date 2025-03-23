package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public class NumeroValidador extends Validador{

    protected String mensaje;

    public NumeroValidador(){
        this.mensaje = "El campo debe ser un número.";
    }

    @Override
    public Boolean esValido(String valor) {
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
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
