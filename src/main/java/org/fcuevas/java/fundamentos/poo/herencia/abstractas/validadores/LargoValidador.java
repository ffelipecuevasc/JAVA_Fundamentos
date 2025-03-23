package org.fcuevas.java.fundamentos.poo.herencia.abstractas.validadores;

public class LargoValidador extends Validador{

    protected String mensaje;
    protected Integer min;
    protected Integer max;

    public LargoValidador(){

    }

    public LargoValidador(Integer min, Integer max){
        this.mensaje = "El campo debe tener un mínimo de %d caracteres y máximo %d caracteres.";
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public Boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor == null) return true;
        int largo = valor.length();
        return (largo >= min && largo <= max);
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
