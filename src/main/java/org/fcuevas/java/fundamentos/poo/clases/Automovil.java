package org.fcuevas.java.fundamentos.poo.clases;

public class Automovil {
    private Integer id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Double cilindrada;
    private Integer capacidadEstanque;
    private Conductor conductor;
    private static Integer cantidadRuedas;
    private static Integer ultimoId;

    protected final static Integer VEL_MAX_CARRETERA = 120;
    protected static final Integer VEL_MAX_CIUDAD = 60;

    //Método que se ejecuta antes del constructor y cada vez que se crea una instancia
    {
        capacidadEstanque = 40;
    }

    //Método que se ejecuta solo 1 vez, cuando la JVM carga la clase
    static{
        cantidadRuedas = 4;
        ultimoId = 0;
    }

    public Automovil(){
        this.fabricante = null;
        this.modelo = null;
        this.color = null;
        this.cilindrada = null;
        this.conductor = null;
        id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo, Color color, Double cilindrada, Conductor conductor) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(Integer capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    //Método GET para el atributo de la clase (estático)
    public static Integer getCantidadRuedas(){
        return cantidadRuedas;
    }

    ////Método SET para el atributo de la clase (estático)
    public static void setCantidadRuedas(Integer ruedas){
        cantidadRuedas = ruedas;
    }

    public void detalle(){
        System.out.println("\nMÉTODO DETALLE DEL AUTOMOVIL");
        System.out.println("\tAuto ID: " + this.id);
        System.out.println("\tAuto Fabricante: " + this.fabricante);
        System.out.println("\tAuto Modelo: " + this.modelo);
        System.out.println("\tAuto Color: " + this.color.getDetalle());
        System.out.println("\tAuto Cilindrada: " + this.cilindrada);
        System.out.println("\tAuto Conductor: " + this.conductor.getNombre() + " " + this.conductor.getApellido());
    }

    public String detalleStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nMÉTODO DETALLE (STRING BUILDER) DEL AUTOMOVIL")
                .append("\n\tAuto ID: " + this.id)
                .append("\n\tAuto Fabricante: " + this.fabricante)
                .append("\n\tAuto Modelo: " + this.modelo)
                .append("\n\tAuto Color: " + this.color.getDetalle())
                .append("\n\tAuto Cilindrada: " + this.cilindrada)
                .append("\n\tAuto Conductor: " + this.conductor.getNombre() + " " + this.conductor.getApellido());
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " " + this.modelo + " acelera a " + rpm + " RPM.";
    }

    public String frenar(){
        return "El auto " + this.fabricante + " " + this.modelo + " frenó.";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar.concat("\nPero de forma repentina... ").concat(frenar);
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100F));
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equalsIgnoreCase(a.getFabricante()) && this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color.getDetalle() + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                ", conductor=" + conductor.getNombre() + " " + conductor.getApellido() +
                '}';
    }
}
